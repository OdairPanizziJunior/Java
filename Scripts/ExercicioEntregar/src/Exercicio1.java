
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as 3 notas do aluno:");
        double n1, n2, n3, freq;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        System.out.println("Informe informe a frequencia do aluno:");
        freq = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;
        System.out.print("Media das notas: " + media);
        System.out.println("");
        System.out.println("Frequencia: " + freq + "%");

        if ((freq < 75) || (media < 5)) {
            System.out.print("Reprovado!");
        }
        if ((freq >= 75 && freq <= 100) && (media >= 5 && media <= 30)) {
            System.out.print("Aprovado!");
        }
    }
}