
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero inteiro:");
        int n = ler.nextInt();
        boolean ehPrimo = true;
        int i = 2;
        while ((ehPrimo == true) && (i <= (n / 2))) {
            if ((n % i) == 0) {
                ehPrimo = false;
            } else {
                i++;
            }
        }
        if (ehPrimo == true) {
            System.out.println(n + " é um numero primo.");
        } else {
            System.out.println(n + " não um numero primo.");
        }
    }
}
// para teste
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97