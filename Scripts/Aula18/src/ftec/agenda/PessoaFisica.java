package ftec.agenda;

import java.util.Date;

public class PessoaFisica extends Contato {

    private String cpf;
    private Date nascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String apresentacao() {
        return "Oi, sou " + this.getNome() + " meu CPF = " + cpf;
    }
}
