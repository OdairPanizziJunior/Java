public class Cidade {

    private int codigo;
    private String descricao;
    private Estado estado;

    public Cidade(int codigo, String descricao, Estado estado) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estado = estado;
    }
 
     public Cidade(int codigo, String descricao, String sigla, String nomeestado) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estado = new Estado(sigla, nomeestado);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "" + codigo +"_" + descricao + ", " + estado;
    }
     
}
