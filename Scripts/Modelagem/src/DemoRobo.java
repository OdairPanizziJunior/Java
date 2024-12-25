
public class DemoRobo {

    public static void main(String args[]) {
        Robo r1 = new Robo("Robo1", 10, 20);
        Robo r2 = new Robo("Robo2", 30, 40, 'n');
        r1.mudaDirecao('s');
        r2.mudaDirecao('o');
        System.out.println(r1.posicao());
        System.out.println(r2.posicao());
        r1.mover(5);
        r1.mudaDirecao('l');
        r1.mover(10);
        System.out.println(r1.posicao());
        r2.mover('n', 5);
    }
}
