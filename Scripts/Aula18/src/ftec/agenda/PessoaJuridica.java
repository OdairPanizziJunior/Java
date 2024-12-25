package ftec.agenda;

import java.util.Date;

public class PessoaJuridica extends Contato {

    private String cnpj;
    private Date fundacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

        public String apresentacao() {
        return "Racao Social, " + this.getNome() + ", CNPJ = " + cnpj;
    }
}
