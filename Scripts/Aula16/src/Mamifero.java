
public class Mamifero extends Animal {

    private int patas;

    public Mamifero(String nome, int patas) {
        super(nome);
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String detalhes() {
        return "Mamifero: " + this.getNome() + " com " + patas + " patas";
    }
}
