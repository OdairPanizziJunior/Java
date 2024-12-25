
import java.util.Scanner;

public class DiasDaSemana3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nomes[] = new String[7];
        nomes[0] = "Domingo";
        nomes[1] = "Segunda";
        nomes[2] = "Terça";
        nomes[3] = "Quarta";
        nomes[4] = "Quinta";
        nomes[5] = "Sexta";
        nomes[6] = "Sábado";

        int conta = 0;
        while (++conta < 3) {
            System.out.print("Informe um valor entre 1 e 7 ou 0 para sair: ");

            int dia = sc.nextInt();

            if (dia == 0) {
                break;
            }
            if (dia >= nomes.length) {
                conta--;
                continue;
            }

            System.out.println(nomes[dia - 1]);
        }
    }
}
