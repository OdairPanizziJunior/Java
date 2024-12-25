
public class Lampada {
    int potencia;
    String marca;
    double preco;
    
    void inicializa(int p, String m, double v) {
        potencia = p;
        marca = m;
        preco = v;
    }
    
    void detalhar(){
        System.out.println("Potencia: " + potencia);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
    }
    
    void detalharPotencia(){
        System.out.println("Potencia: " + potencia);
    }
    
    int retornarPotencia(){
        return potencia;
    }
}

