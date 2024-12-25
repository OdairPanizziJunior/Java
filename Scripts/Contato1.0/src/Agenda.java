
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Agenda {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Contato dados[] = new Contato[5];

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("**Agenda 1.0**");
            System.out.println("I = Incluir");
            System.out.println("L = Listar");
            System.out.println("P = Pesquizar");
            System.out.println("X = Sair");

            String opcao = sc.nextLine();

            if (opcao.equalsIgnoreCase("X")) {
                System.exit(0);
            }

            if (opcao.equalsIgnoreCase("I")) {
                System.out.println("Informe o Nome: ");
                String nome = sc.nextLine();
                System.out.println("Informe o Telefone: ");
                String fone = sc.nextLine();
                System.out.println("Informe o Email: ");
                String email = sc.nextLine();
                System.out.println("Data de Nascimento (dd/mm/aaaa): ");
                String nascimento = sc.nextLine();
                System.out.println("Informe a Cidade: ");
                String cidade = sc.nextLine();


                Date nasceu;
                try {
                    nasceu = sdf.parse(nascimento);
                } catch (ParseException e) {
                    System.out.println("Data Inválida\n");
                    continue;
                }
                Contato c;
                c = new Contato(nome, fone, email, nasceu, cidade);

                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] == null) {
                        dados[i] = c;
                        break;
                    }
                }
            }
            if (opcao.equalsIgnoreCase("l")) {
                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] != null) {
                        Contato c = dados[i];
                        System.out.println(c);
                    }


                }
            }
            if (opcao.equalsIgnoreCase("p")) {
                System.out.println("Pesquisar contatos: ");
                String pesquisa = sc.nextLine();
            
                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] != null) {
                        Contato c = dados[i];
                        if (c.getNome().contains(pesquisa)) {
                            System.out.println(c);
                        }
                    }
                    }

                }
            }
    }
}