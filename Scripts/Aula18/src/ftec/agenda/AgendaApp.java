package ftec.agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AgendaApp {

    private List<Contato> dados;

    public AgendaApp() {
        dados = new ArrayList<Contato>();
        while (true) {
            int opcao = this.opcao();
            switch (opcao) {
                case 1:
                    this.adicionar();
                    break;
                case 2:
                    this.editar();
                    break;
                case 3:
                    this.remover();
                    break;
                case 4:
                    this.listar();
                    break;
                case 5:
                    this.salvar();
                    break;
                case 6:
                    this.abrir();
                    break;
            }
            if (opcao < 1) {
                break;
            }
        }

    }

    public int opcao() {
        String aux = JOptionPane.showInputDialog(null, "1-Incluir\n 2-Editar\n 3-Remover\n 4-Listar \n 5-Salvar  \n 6-Abrir \n0-Sair");
        if (aux == null) {
            return 0;
        } else {
            return Integer.parseInt(aux);
        }
    }

    public void adicionar() {
        String nome = JOptionPane.showInputDialog(null, "Entre com o nome");
        String fone = JOptionPane.showInputDialog(null, "Entre com o fone");
        String tipo = JOptionPane.showInputDialog(null, "1-Pessoa Fisica  2-Pessoa Juridica");

        Contato c = null;

        if (tipo.equals("1")) {
            String data = JOptionPane.showInputDialog(null, "Data de Nascimento (dd/mm/aaaa)");
            String cpf = JOptionPane.showInputDialog(null, "CPF");

            c = new PessoaFisica();
            
            c.setNome(nome);
            c.setFone(fone);
            ((PessoaFisica) c).setNascimento(strToDate(data));
            ((PessoaFisica) c).setCpf(cpf);

        } else {
            String data = JOptionPane.showInputDialog(null, "Data de Fundacao (dd/mm/aaaa)  ");
            String cnpj = JOptionPane.showInputDialog(null, "CNPJ");

            c = new PessoaJuridica();
            c.setNome(nome);
            c.setFone(fone);
            ((PessoaJuridica) c).setFundacao(strToDate(data));
            ((PessoaJuridica) c).setCnpj(cnpj);

        }
        this.adicionar(c);

    }

    public void editar() {
        String s = JOptionPane.showInputDialog(null, "Informe o codigo do Contato:");
        int indice = Integer.parseInt(s);
        Contato c = this.buscar(indice);
        if (c == null) {
            return;
        }

        String nome = JOptionPane.showInputDialog("Confirme o nome", c.getNome());
        String fone = JOptionPane.showInputDialog("Confirme o fone", c.getFone());

        if (c instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) c;

            String data = JOptionPane.showInputDialog("Confirme a Data de Nascimento", dateToStr(pf.getNascimento()));
            String cpf = JOptionPane.showInputDialog("Confirme o CPF", pf.getCpf());

            pf.setNome(nome);
            pf.setFone(fone);
            pf.setNascimento(strToDate(data));
            pf.setCpf(cpf);

            this.atualizar(indice, pf);
        } else {
            PessoaJuridica pj = (PessoaJuridica) c;
            String data = JOptionPane.showInputDialog("Confirme a Data de Nascimento", dateToStr(pj.getFundacao()));
            String cnpj = JOptionPane.showInputDialog("Confirme o CNPJ", pj.getCnpj());

            pj.setNome(nome);
            pj.setFone(fone);
            pj.setFundacao(strToDate(data));
            pj.setCnpj(cnpj);

            this.atualizar(indice, pj);
        }
    }

    public void remover() {
        String s = JOptionPane.showInputDialog(null, "Informe o codigo do Contato:");
        int indice = Integer.parseInt(s);
        Contato c = this.buscar(indice);
        if (c == null) {
            return;
        }
        this.remover(indice);
    }

    public void listar() {
        StringBuilder sb = new StringBuilder();
        for (Contato c : this.getContatos()) {
            sb.append(c.apresentacao()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void salvar() {
        try {
            PrintWriter out = new PrintWriter(File.separator + "agenda.txt");
            for (Contato c : this.getContatos()) {
                String linha = "";
                if (c instanceof PessoaFisica) {
                    PessoaFisica p = (PessoaFisica) c;
                    linha = "PF|" + p.getNome() + "|" + p.getFone() + "|" + p.getCpf() + "|" + dateToStr(p.getNascimento());
                } else {
                    PessoaJuridica p = (PessoaJuridica) c;
                    linha = "PJ|" + p.getNome() + "|" + p.getFone() + "|" + p.getCnpj() + "|" + dateToStr(p.getFundacao());
                }
                out.println(linha);
            }
            out.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void abrir() {
        try {
            FileReader reader = new FileReader(File.separator + "agenda.txt");
            Scanner in = new Scanner(reader);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner sc = new Scanner(line);
                sc.useDelimiter("\\|");
                String str = sc.next();

                Contato c = null;
                
                if (str.equals("PF")) {
                    c = new PessoaFisica();
                    c.setNome(sc.next());
                    c.setFone(sc.next());
                    ((PessoaFisica) c).setCpf(sc.next());
                    ((PessoaFisica) c).setNascimento(strToDate(sc.next()));
                } else {
                    c = new PessoaJuridica();
                    c.setNome(sc.next());
                    c.setFone(sc.next());
                    ((PessoaJuridica) c).setCnpj(sc.next());
                    ((PessoaJuridica) c).setFundacao(strToDate(sc.next()));
                }
                this.adicionar(c);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AgendaApp();
    }

    public static Date strToDate(String str) {
        Date data = null;
        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(str);
        } catch (ParseException ex) {
            data = null;
            ex.printStackTrace();
        }
        return data;
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
    
    public List<Contato> getContatos() {
        return dados;
    }

    public boolean adicionar(Contato contato) {
        return dados.add(contato);
      }

    public boolean atualizar(int indice, Contato contato) {
        try {
            this.dados.set(indice, contato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remover(int indice) {
        try {
            this.dados.remove(indice);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Contato buscar(int indice) {
        return this.dados.get(indice);
    }
    
}
