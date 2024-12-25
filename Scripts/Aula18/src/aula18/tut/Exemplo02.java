package aula18.tut;

public class Exemplo02 {

    public static void main(String args[]) {
        java.io.File diretorio = new java.io.File("C:\\TutorialArquivos");
        java.io.File arquivo = new java.io.File(diretorio, "arq_01.txt");
        try {
            boolean statusArq = arquivo.createNewFile();
            System.out.print(statusArq);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
