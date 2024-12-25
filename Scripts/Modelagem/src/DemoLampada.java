
public class DemoLampada {
    public static void main(String args[]){
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();
        
        l1.detalhar();
        
        l1.inicializa(25, "lux", 7.80);
        
        l1.detalhar();
        
        l2.inicializa(50, "Philips", 15.80);
        
        l2.detalhar();
        
        l1.detalhar();
    }
}
