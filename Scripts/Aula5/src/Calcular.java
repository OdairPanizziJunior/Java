
import java.util.Scanner;

public class Calcular {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois Valores: ");
        String v1 = sc.nextLine();
        String v2 = sc.nextLine();

        double d1 = Double.parseDouble(v1);
        double d2 = Double.parseDouble(v2);
        mensagem("Soma: " + somar(d1, d2));
        mensagem("Subtração: " + subt(d1, d2));
        mensagem("Divisão: " + divi(d1, d2));
        mensagem("Multiplicação " + multi(d1, d2));

    }

    public static void mensagem(String msg) {
        System.out.println(msg);
    }

    public static double somar(double a, double b) {
        double soma = a + b;
        return soma;
    }

    public static double subt(double a, double b) {
        double sub = a - b;
        return sub;
    }

    public static double divi(double a, double b) {
        double div = a / b;
        return div;
    }

    public static double multi(double a, double b) {
        double mul = a * b;
        return mul;
    }
}
