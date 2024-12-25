package aula18.tut;

import java.io.File;

public class Exemplo04 {

    public static void main(String args[]) {
        File dir = new File("C:\\TutorialArquivos");
        File arq = new File(dir, "arq_01.txt");
        File arq2 = new File(dir, "arq_02.txt");
        boolean statusRename = arq.renameTo(arq2);
        System.out.println("Renomeando: " + statusRename + " New name: " + arq);
    }
}
