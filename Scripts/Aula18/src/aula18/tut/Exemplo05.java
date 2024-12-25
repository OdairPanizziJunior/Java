package aula18.tut;

import java.io.File;

public class Exemplo05 {

    public static void main(String args[]) {
        File dir = new File("C:\\TutorialArquivos");
        File dir3 = new File(dir + "\\DiretorioTres");
        File arq3 = new File(dir, "arq_03.txt");

        System.out.println(dir3.delete());
        System.out.println(arq3.delete());
    }
}
