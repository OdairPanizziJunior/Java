
public class Media {

    public static void main(String args[]) {
        int valores[] = {1};
       
        int soma = 0;
        
        for (int i = 0; i < valores.length; i++){
            soma += valores[i];
        }
        System.out.println("Média = " + (soma / (valores.length * 1.0)));
    }
}
