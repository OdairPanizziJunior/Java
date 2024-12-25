package aula18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/** Síntese
 *    Objetivo: registra dados de pessoas em arquivo
 *    Entrada:  nome e idade de amigos
 *    Saída:    listagem de todos registros
 */
public class UsaArquivoTexto {

    public static void main(String[] args) {
        File arquivo = new File("c:\\dados.txt");
        Amigo pessoa = new Amigo();
        ArquivoTexto manipulador = new ArquivoTexto();
        int continua;

        try {
            // Gravando no arquivo de texto
            PrintWriter grava = new PrintWriter(new FileWriter(arquivo));
            do {
                pessoa.setNome(validaNome());
                pessoa.setIdade(validaIdade());
                manipulador.escrever(grava, pessoa.getNome(), pessoa.getIdade());

                // continuação do exemplo anterior

                continua = JOptionPane.showConfirmDialog(null,
                        "Realizar novo cadastro?", "Confirmação",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
            } while (continua == 0);
            grava.close();
        } catch (IOException ex) {
            System.out.print("Sem acesso ao arquivo.");
        }

        // Leitura do Arquivo de Texto
        continua = JOptionPane.showConfirmDialog(null,
                "Deseja listar os registros do arquivo?",
                "Confirmação", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (continua == 0) {
            manipulador.ler(arquivo);
        }
    }

    // continuação do exemplo anterior
    public static String validaNome() {
        String nome;
        do {
            nome = JOptionPane.showInputDialog(null,
                    "Informe o nome completo.", "Entrada Dados",
                    JOptionPane.QUESTION_MESSAGE);
        } while (nome == null || nome.equals(""));
        return nome;
    }

    public static int validaIdade() {
        String idadeAux;
        int idade = 0;
        do {
            idadeAux = JOptionPane.showInputDialog(null,
                    "Informe a idade em anos.", "Entrada Dados",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                idade = Integer.parseInt(idadeAux);
            } catch (NumberFormatException excecao) {
                JOptionPane.showMessageDialog(null,
                        "Idade inválida. Informe novamente.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                idadeAux = null;
            }
        } while ((idade <= 0) || (idadeAux == null));
        return idade;
    }
}

/** Síntese
 *    Conteúdo: estrutura de dados heterogênea
 *      - getIdade(), getNome()
 *      - setIdade(int), setNome(String)
 */
class Amigo {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
