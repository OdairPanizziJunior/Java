
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class TesteEscrita {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Nome do Arquivo");


        File f = new File(nome);
        if (f.exists()) {
                
            int resultado = JOptionPane.showInternalConfirmDialog(null, "Já Existe, Subtituir: ");
            if (resultado != JOptionPane.YES_OPTION){
            System.exit(0);
        }
        }
        try {
            PrintWriter saida = new PrintWriter(f);
            saida.print("Escrevendo");
            saida.print(" em Java, ");
            saida.printf("utilizando \n JAVA.IO \n");
            saida.println("Vamos ver o Resultado");

            saida.close();
        } catch (Exception ex) {
            System.out.println("Erro escrevendo em " + f.getName());
        }

    }
}
