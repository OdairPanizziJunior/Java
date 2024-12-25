public class Métodos {
    public static void main(String args[]) {
        escrever();
        mensagem("FTec");
        escrever();
        mensagem("JAVA");
        somar(3, 7);
        
        int resultado = somar(3, 7);
        mensagem("" + (resultado + 2));
        
        int idade = 18;
        incrementar(idade);
        mensagem("" + idade);
        
    }
    
    public static void escrever(){
        System.out.println("Meu Primeiro método!!");
    }

    public static void mensagem(String msg){
        System.out.println(msg); 
    }
    
    public static int somar(int a, int b){
        int soma = a + b;
        return soma;       
    }
    
    public static void incrementar(int v){
        v++;
        System.out.println(v);
    }
}




