package aula18;

/** Síntese
 *    Conteúdo: manipulação de arquivo texto
 *      - escrever(PrintWriter,String,int)
 *      - ler(File)
 */
import java.io.*;

public class ArquivoTexto {

    public void escrever(PrintWriter grava, String nome, int idade) {
        grava.print(nome + "=");
        grava.print(idade + "\r\n");
        if (grava.checkError()) {
            System.out.print("Sem gravação no arquivo.");
        }
    }

    public void ler(File arquivo) {
        String linhaArquivo;
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            System.out.println("\nRESGISTRO NO ARQUIVO: " + arquivo.getName());
            while ((linhaArquivo = leitor.readLine()) != null) {
                linhaArquivo = linhaArquivo.replace("=", "\t");
                System.out.println(linhaArquivo);
            }
            leitor.close();
        } catch (IOException ex) {
            System.out.print("Sem acesso ao arquivo.");
        }
    }
}
