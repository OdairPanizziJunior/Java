
import java.util.Scanner;

public class exercicio4 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os segundos trabalhados:");

        int h = sc.nextInt();
        int horas = (h / 3600);
        int sobra = (h % 3600);
        int minutos = (sobra / 60);
        int segundos = (sobra % 60);
        
        System.out.println("Você trabalhou " + horas + " horas, " + minutos + " minuto" + " e " + segundos + " segundos!!");

    }
}
