
public class Robo {
    
    private String nome;
    private int x, y;
    private char direcao;
    
    public Robo(String n, int xx, int yy) {
        //this(n, xx, yy, 'l'); isso pode ser usado para gerar a direção default.
        nome = n;
        x = xx;
        y = yy;
        direcao = 'n';
        
    }
    
    public Robo(String nome, int x, int y, char direcao) {
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }
    
    public void mudaDirecao(char direcao) {
        if (direcao == 'l' || direcao == 'o' || direcao == 'n' || direcao == 's') {
            this.direcao = direcao;
        }
    }

    public String posicao() {
        String s = nome + "x = " + x + "y = " + y;
        s = s + "direcao = " + direcao;
        return s;
    }

    public void mover(int passos) {
        if (direcao == 'n') {
            y = y + passos;
        }
        if (direcao == 's') {
            y = y - passos;
        }
        if (direcao == 'l') {
            y = y + passos;
        }
        if (direcao == 'o') {
            y = y - passos;
        }
    }

    public void mover() {
        this.mover(1);
        
    }

    public void mover(char direcao, int passos) {
        this.mudaDirecao(direcao);
        this.mover(passos);
    }
}
