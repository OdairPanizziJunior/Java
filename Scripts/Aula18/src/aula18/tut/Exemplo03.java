package aula18.tut;

import java.io.File;

public class Exemplo03 {

    public static void main(String args[]) {
        File diretorio = new java.io.File("C:\\TutorialArquivos");
        File arquivo = new java.io.File(diretorio, "arq_01.txt");
        if (diretorio.exists()) {
            System.out.println("Diretório existe!");
            if (arquivo.exists()) {
                System.out.println("Arquivo existe!");
            }
        }

        File files = new File("C:\\");
        for (File file : files.listFiles()) {
            System.out.println(file);
        }

    }
}
