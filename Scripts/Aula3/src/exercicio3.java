
import java.util.Scanner;

public class exercicio3 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a idade em dias: ");

        int a = sc.nextInt();
        int ano = (a / 365);
        int sobra = (a % 365);
        int mes = (sobra / 30);
        int dias = (sobra % 30);
        
        System.out.println("Você tem " + ano + " ano, " + mes + " meses" + " e " + dias + " dias de vida!!");

    }
}
