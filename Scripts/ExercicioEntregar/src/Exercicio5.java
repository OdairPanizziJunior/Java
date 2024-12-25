
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double totalNotas = 0;
        double nota = 0, media = 0;

        System.out.println("Forneça as respectivas notas.\nPara sair, digite -1");

        while (nota != -1) {
            nota = input.nextDouble();
            totalNotas += nota;
            count++;
        }

        media = totalNotas / (count);

        System.out.print("Média das notas:" + media);

    }
}