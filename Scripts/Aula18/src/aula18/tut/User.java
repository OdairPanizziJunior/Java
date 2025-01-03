package aula18.tut;

public class User {
    private Integer id;
    private String nome;
    private String observacao;

    public User() {
    }

    public User(Integer id, String nome, String observacao) {
        this.id = id;
        this.nome = nome;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "" + id + " " + nome + " " + observacao;
    }

}
