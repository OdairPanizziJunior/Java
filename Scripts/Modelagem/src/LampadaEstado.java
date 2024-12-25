
public class LampadaEstado {

    int intensidade;

    void ligar() {
        intensidade = 100;

    }

    void desligar() {
        intensidade = 0;

    }

    void dimer(int quantidade) {
        intensidade = quantidade;

    }

    String obterEstado() {
        if (intensidade > 0) {
            return "ligada";
        } else {
            return "desligada";

        }
    }

    int obterIntensidade() {
        return intensidade;
    }
}
