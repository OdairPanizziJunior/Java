
import java.util.Scanner;

public class DiasDaSemana2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int conta = 0;
        while (++conta < 3) {
            System.out.print("Informe um valor entre 1 e 7 ou 0 para sair: ");

            int dia = sc.nextInt();

            if (dia == 0) {
                break;
            }
            if (dia > 10) {
                conta--;
                continue;
            }

            switch (dia) {
                case 1:
                    System.out.println("Domingo!!!");
                    break;
                case 2:
                    System.out.println("Segunda!!!");
                    break;
                case 3:
                    System.out.println("Terça!!!");
                    break;
                case 4:
                    System.out.println("Quarta!!!");
                    break;
                case 5:
                    System.out.println("Quinta!!!");
                    break;
                case 6:
                    System.out.println("Sexta!!");
                    break;
                case 7:
                    System.out.println("sábado!!");
                    break;
                default:
                    System.out.println("Valor Inválido " + dia);
            }
        }
    }
}
