
import java.text.SimpleDateFormat;
import java.util.Date;


public class Contato {
    private String nome;
    private String fone;
    private String email;
    private Date nascimento;
    private String cidade;

    public Contato(String nome, String fone, String email, Date nascimento, String cidade) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.nascimento = nascimento;
        this.cidade = cidade;
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

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return  "Nome = " + nome + ", Fone = " + fone + ", Email = " + email + ", Nascimento = " + sdf.format(nascimento) + ", Cidade = " + cidade;
    }
    


}
