                                                                   
                                             
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double peso = 0, altura = 0, imc ,resultado = 0;
        while(true){
        System.out.println("Informe a Opcao: ");
        System.out.println("1 - Dados da Pessoa ");
        System.out.println("2 - calcular IMC ");
        System.out.println("3 - Verificar condição ");
        System.out.println("4 - Sair ");
        
        int opcao = sc.nextInt();
      
        
        
            switch(opcao){
            case 1:                 
                System.out.println("Digite o peso: ");
                peso = sc.nextDouble();
                System.out.println("");
                System.out.println("Digite a altura: ");
                altura = sc.nextDouble();
                System.out.println("");
                System.out.println("Dados Inseridos com sucesso!");
                System.out.println("");
            break; 
            
            case 2:
                imc = (peso)/(altura*altura);
                System.out.println("IMC: " + imc);
                System.out.println("");
            break;
            
            case 3: 
                if (resultado<=19) {
                    System.out.println("Abaixo do peso normal"); 
                    System.out.println("");
                }
                if (19 < resultado && resultado <= 27) {
                    System.out.println("Peso normal");
                    System.out.println("");
                }
                if (27 < resultado && resultado<=32){
                    System.out.println("Acima do peso normal"); 
                    System.out.println("");
                }
                if( resultado > 32) {
                    System.out.println("Obsidade"); 
                    System.out.println("");
                }
            break;
            
            case 4: 
                System.exit(0);
                                
            default: 
                System.out.println("");
                System.out.println("OPCAO INVALIDA: ");
                break;
            
            }
    
            
            }
    
        
}
}