
public class Data {

    private int dia, mes, ano;

    void inicializar(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    boolean validar() {
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (ano < 1 || ano > 2100) {
            return false;
        }
        return true;
    }

    void imprimir() {
    }

    int getDia() {
        return dia;
    }

    int getMes() {
        return mes;
    }

    int getAno() {
        return ano;
    }

    void setDia(int d) {
        dia = d;
    }

    void setMes(int m) {
        mes = m;

    }

    void setAno(int a) {
        if(a > 0){
            ano = a;
        }
    }
}
