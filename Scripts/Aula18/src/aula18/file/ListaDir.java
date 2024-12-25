package aula18.file;

import java.io.File;

public class ListaDir {

    public static void main(String args[]) {
        String nomeDir = "c:\\";
        File f1 = new File(nomeDir);
        if (f1.isDirectory()) {
            System.out.println("Diretorio " + nomeDir);
            for (File f : f1.listFiles()){
                System.out.println(f.getName());
                if (f.isDirectory()) {
                    System.out.println(" <dir> ");
                } else {
                    System.out.println(" <file>");
                }
            }
        } else {
            System.out.println(nomeDir + " nao e um diretorio.");
        }
    }
}
