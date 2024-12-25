
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestaLeitura {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Nome do Arquivo");

        File f = new File(nome);
        if (!f.exists()) {
            System.out.println("O Arquivo da Existe");
            System.exit(0);
        }
        if (!f.canRead()) {
            System.out.println("Sem permissão para Leitura");
            System.exit(0);

        }
        try {
            FileReader leitor = new FileReader(f);

            Scanner sc = new Scanner(leitor);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            leitor.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro Lendo" + f.getName());
        } catch (IOException ex) {
            System.out.println("Erro fechando arquivo");
        }
    }
}
