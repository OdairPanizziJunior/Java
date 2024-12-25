
public class ColecaoCds {

    private int anoLançamento;
    private String cantorBanda, tituloCd;

    void inicializar(String c, int a, String t) {
        anoLançamento = a;
        cantorBanda = c;
        tituloCd = t;
    }

    String getCantorBanda() {
        return cantorBanda;
    }

    String getTituloCd() {
        return tituloCd;
    }

    int getAno() {
        return anoLançamento;
    }
}

    

