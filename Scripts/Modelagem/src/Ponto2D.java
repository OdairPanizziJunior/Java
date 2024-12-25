
public class Ponto2D {
    double retaX;
    double retaY;
    
    void inicializa(double x, double y) {
        retaX = x;
        retaY = y;
    }
    
    void detalhar(){
        System.out.println("Valor da Reta X: " + retaX);
        System.out.println("Valor da reta Y: " + retaY);
      
    }
    
    void detalharX(){
        System.out.println("Reta X: " + retaX);
    }
    
    double retornaX(){
        return retaX;
    }
    
    void detalharY(){
        System.out.println("Reta X: " + retaX);
    }
    
    double retornaY(){
        return retaY;
    }
}
    

