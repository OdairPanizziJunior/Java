
public class Exercicio1 {
    private int codigo;
    private String nome;
    private static int ultimo;

    public Exercicio1(String nome) {
        this.nome = nome;
        ultimo++;
        this.codigo = ultimo;
    }
    
    @Override
    public String toString(){
        return "" + codigo + " " + nome;
    }
    
}
