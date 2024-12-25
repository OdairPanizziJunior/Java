
public class ContatoComercial extends Agenda {

    private int patas;

    public ContatoComercial(String nome, int patas) {
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
