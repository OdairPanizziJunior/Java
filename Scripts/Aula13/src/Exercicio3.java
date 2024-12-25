
public class Exercicio3 {

    public static void main(String args[]) {
        int dias = 624;
        int horas = Exercicio2.diasParaHoras(dias);
        int minutos = Exercicio2.horasParaMinutos(horas);
        int segundos = Exercicio2.minutosParaSegundos(minutos);
    

    System.out.println ("Dias: " + dias);
    System.out.println ("Horas: " + horas);
    System.out.println ("Minutos: " + minutos);
    System.out.println ("Segundos: " + segundos);
    
}
}