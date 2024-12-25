
public class ContatoResidencial extends Agenda {

    private boolean nadar;

    public ContatoResidencial(String nome, boolean nadar) {
        super(nome);
        this.nadar = nadar;
    }

    public boolean isNadar() {
        return nadar;
    }

    public void setNadar(boolean nadar) {
        this.nadar = nadar;
    }

    @Override
    public String detalhes() {
        return "Ave: " + this.getNome() + ". Sabe nadar: " + nadar;
    }
}
