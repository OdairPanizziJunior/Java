package ftec.agenda;

public abstract class Contato {

    private String nome;
    private String fone;
    
    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fonel) {
        this.fone = fonel;
    }

    public abstract String apresentacao();
}