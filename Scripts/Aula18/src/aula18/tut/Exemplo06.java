package aula18.tut;

import java.io.File;
import java.io.IOException;

public class Exemplo06 {

    public static void main(String args[]) {
        File dir = new File("C:\\TutorialArquivos");
        File dir2 = new File(dir + "\\DiretorioDois");
        dir2.mkdirs();
        File dir3 = new File(dir + "\\DiretorioTres");
        dir3.mkdir();

        File arq3 = new File(dir, "arq_03.txt");
        try {
            arq3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f + " é um diretório.");
            } else if (f.isFile()) {
                System.out.println(f.getName() + " é um arquivo.");
            }
        }

    }
}
