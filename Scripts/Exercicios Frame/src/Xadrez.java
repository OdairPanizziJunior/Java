
import java.awt.Graphics;
import javax.swing.JFrame;

public class Xadrez extends JFrame {

    public static void main(String args[]) {
        Xadrez x = new Xadrez();
        x.setVisible(true);
    }

    public Xadrez() {
        setTitle("Tabuleiro de Xadrez");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        int padding = 20;
        int esquerda = 0;
        int topo = 0;

        for (int i = 0; i < 8; i++);
        {
          

        }
        for (int j = 0; j < 8; j++);
        {
        }
    }
}
