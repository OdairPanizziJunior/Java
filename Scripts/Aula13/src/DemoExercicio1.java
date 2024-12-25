
public class DemoExercicio1 {

    public static void main (String args[]){
        Exercicio1 dados[] = new Exercicio1[5];
    
        dados[0] = new Exercicio1("Aluno A");
        dados[1] = new Exercicio1("Aluno B");
        dados[2] = new Exercicio1("Aluno C");
        dados[3] = new Exercicio1("Aluno D");
        dados[4] = new Exercicio1("Aluno E");
        //Exercicio1 = Aluno
        for (int i = 0; i < dados.length; i++){
            Exercicio1 Exercicio1 = dados[i];
            System.out.println(Exercicio1);
        }
        
    }
}
