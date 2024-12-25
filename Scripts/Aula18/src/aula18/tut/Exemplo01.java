package aula18.tut;

public class Exemplo01 {

    public static void main(String args[]) {
        java.io.File diretorio = new java.io.File("C:\\TutorialArquivos");
        boolean statusDir = diretorio.mkdir();
	System.out.println(statusDir);
    }
}
