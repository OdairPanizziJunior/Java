
public class Veiculo {
    String nome;
    String categoria;
    int capacidade;
    int qtdRodas;
    String cor;
    int ano;
    
    void inicializa(String n, int c, String ct, int qr, String cr, int a) {
        nome = n;
        categoria = ct;
        qtdRodas = qr;
        capacidade = c;
        cor = cr;
        ano = a; 
    }
    
    void detalhar(){
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Número de Rodas: " + qtdRodas);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + ano);
    }
}
