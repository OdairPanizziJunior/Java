
import java.util.Scanner;

public class condicional {

    int valor = 0;

    public static void main(String agrs[]) {
        System.out.println("Informe um numero inteiro");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((n % 2) == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        boolean b = false;
        if (b = true) {
            System.out.println("B True");
        }
    }
}
