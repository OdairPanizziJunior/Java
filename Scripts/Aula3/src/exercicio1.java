import java.util.Scanner;

public class exercicio1 {

        public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado");
        int a = sc.nextInt();
        
        int result = (a * a);
        
        System.out.println("A Area do quadrado é = " + result);
        
    }
    
}
