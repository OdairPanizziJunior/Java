import java.util.Scanner;

public class media {

    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Tres numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int media = (a + b + c) / 3;
        
        System.out.println("Media = " + media );
        
        
    }
}
