
public class Exercicio7 {
    public static void main(String args[]){
        int[] valores = new int[10];
                
        valores[0] = 22;
        valores[1] = 10;
        valores[2] = 2;
        valores[3] = 40;
        valores[4] = 5;
        valores[5] = 90;
        valores[6] = 31;
        valores[7] = 44;
        valores[8] = 21;
        valores[9] = 12;
        
        int maior = maior(valores);
        System.out.println("o maior numero e: " + maior);
        System.exit(0);
        
        
    }

    public static int maior(int[] a) {
        int max =a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
                        
            }
        }
    return max;
    }

}