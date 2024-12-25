
public class DemoLampadaEstados {

    public static void main(String args[]) {
        LampadaEstado lampada = new LampadaEstado();

        System.out.println(lampada.obterEstado());

        lampada.ligar();

        System.out.println(lampada.obterEstado());

        lampada.dimer(30);

        System.out.println("Intensidade " + lampada.obterIntensidade());




    }
}
