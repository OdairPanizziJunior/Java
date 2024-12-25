
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salario:");
        double n1;

        n1 = sc.nextDouble();
       
        

        if ((n1 > 0) && (n1 <= 500)){
            System.out.println("Isento!!!");
        }
        if ((n1 > 500) && (n1 <= 1500)){
            System.out.println("Desconto de 10%: " + "R$ " + ((n1) - (n1 * 0.10)));
        }
        if ((n1 > 1500) && (n1 <= 2500)){
            System.out.println("Desconto de 15%: " + "R$ " + ((n1) - (n1 * 0.15)));
        }
        if (n1 > 2500){
            System.out.println("Desconto de 25%: " + "R$ " + ((n1) - (n1 * 0.25)));
        }
    }
}
