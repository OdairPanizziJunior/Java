
import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Forneça 10 valores inteiros para a array A");
        int a[] = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            count = count + a[i];
        }
        double media = count / 10;

        System.out.println("Numeros maiores que a média:");
        for (int i = 0; i < 10; i++) {
            if (a[i] > media) {
                System.out.println(a[i]);
            }
        }
    }
}