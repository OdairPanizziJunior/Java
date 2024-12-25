
import javax.swing.JOptionPane;

public class Contatos {

    private Menu zoo;

    public static void main(String args[]) {
        new Contatos();
    }

    public Contatos() {
        zoo = new Menu();
        menuPrincipal();
    }

    private void menuPrincipal() {
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
                    this.consultar();
                    break;
                case 5:
                    this.listar();
                    break;
            }
            if (opcao < 1) {
                break;
            }
        }
    }

    private int opcao() {
        String aux = JOptionPane.showInputDialog(null, "1-Incluir \n2-Editar \n3-Remover \n4-Consultar \n5-Listar \n0-Sair");
        if (aux == null) {
            return 0;
        } else {
            return Integer.parseInt(aux);
        }
    }

    public void adicionar() {
        String nome = JOptionPane.showInputDialog(null, "Entre com o nome");
        String tipo = JOptionPane.showInputDialog(null, "1-Mamifero  2-Ave");

        Agenda animal = null;

        if (tipo.equals("1")) {
            String patas = JOptionPane.showInputDialog(null, "Quantidade de Patas");

            animal = new Mamifero(nome, Integer.parseInt(patas));

        } else {
            String nadar = JOptionPane.showInputDialog(null, "Sabe Nadar? S-Sim  N-Nao ");

            animal = new Ave(nome, nadar.startsWith("S"));
        }

        this.zoo.adicionar(animal);
    }

    public void editar() {
        String s = JOptionPane.showInputDialog(null, "Informe o codigo do Animal:");
        int indice = Integer.parseInt(s);
        Agenda animal = this.zoo.consultar(indice);
        if (animal == null) {
            return;
        }

        String nome = JOptionPane.showInputDialog("Confirme o nome", animal.getNome());

        if (animal instanceof Mamifero) {
            Mamifero mamifero = (Mamifero) animal;

            String patas = JOptionPane.showInputDialog("Quantidade de patas", mamifero.getPatas());

            mamifero.setPatas(Integer.parseInt(patas));
        } else {
            Ave ave = (Ave) animal;
            String aux = ave.isNadar() ? "S" : "N";
            String nadar = JOptionPane.showInputDialog("Sabe Nadar? S-Sim  N-Nao ", aux);

            ave.setNadar(nadar.startsWith("S"));
        }
        
        animal.setNome(nome);
    }

    public void consultar() {
        String s = JOptionPane.showInputDialog(null, "Informe o codigo do Animal:");
        int indice = Integer.parseInt(s);
        Agenda animal = this.zoo.consultar(indice);
        if (animal == null) {
            return;
        }
        JOptionPane.showMessageDialog(null, animal.detalhes());
    }

    public void remover() {
        String s = JOptionPane.showInputDialog(null, "Informe o codigo do Animal:");
        int indice = Integer.parseInt(s);
        this.zoo.remove(indice);
    }

    public void listar() {
        JOptionPane.showMessageDialog(null, zoo.listarTodos());
    }
}
