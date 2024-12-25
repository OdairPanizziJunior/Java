package aula18.file;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TestaArquivo {

    public static void main(String args[]) {
        
        String nome = JOptionPane.showInputDialog("Arquivo");
               
        
        File f = new File(nome);
        System.out.println("Nome do arquivo: " + f.getName());
        System.out.println("Caminho: " + f.getPath());
        System.out.println("Caminho Absoluto: " + f.getAbsolutePath());
        System.out.println("Diretorio pai: " + f.getParent());
        System.out.println(f.exists() ? "existe" : "nao existe");
        System.out.println(f.canWrite() ? "pode ser gravado" : "nao pode ser gravado");
        System.out.println(f.canRead() ? "pode ser lido" : "nao pode ser lido");
        System.out.println(f.isDirectory() ? "e diretorio" : "nao e diretorio");
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date data = new Date(f.lastModified());
        System.out.println("Ultima modificacao do arquivo: " + df.format(data));
        System.out.println("Tamanho do arquivo: " + f.length() + " bytes.");

    }
}
