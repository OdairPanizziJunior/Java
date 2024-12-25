
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class Exercicio extends JFrame {

    JLabel label1, label2, label3;
    ImageIcon imagem;

    public Exercicio() {
        setTitle("Exercicio de Label");
        setSize(400, 300);
        setLocation(50, 50);
        setBackground(new Color(220, 220, 220));

        imagem = new ImageIcon("img/logo.png");
        
        label1 = new JLabel(imagem);
        label1.setLocation(0, 0);
        label1.setSize(50, 50);

        label2 = new JLabel(imagem);
        label2.setLocation(170, 110);
        label2.setSize(50, 50);

        label3 = new JLabel(imagem);
        label3.setLocation(340, 217);
        label3.setSize(50, 50);

        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.add(label3);

    }
        
    

    public static void main(String args[]) {
        JFrame metodo = new Exercicio();
        metodo.setUndecorated(true);
        metodo.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        metodo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        metodo.setVisible(true);
    }

}