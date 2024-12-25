
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class FrameLabel extends JFrame {

    JLabel label1, label2, label3, label4;
    ImageIcon icone;

    public FrameLabel() {
        setTitle("Inserindo Labels e Imagens na janela");
        setSize(400, 200);
        setLocation(50, 50);
        setBackground(new Color(220, 220, 220));
        
        icone = new ImageIcon("img/logo.png");
        label1 = new JLabel("Aprendendo", JLabel.LEFT);
        label1.setForeground(Color.red);
        label1.setLocation(10, 30);
        label1.setSize(100, 30);
        
        label2 = new JLabel(icone);
        label2.setLocation(120, 30);
        label2.setSize(50, 50);
        
        label3 = new JLabel("Inserir", JLabel.RIGHT);
        label3.setForeground(Color.blue);
        label3.setLocation(10, 100);
        label3.setSize(100, 30);
        
        label4 = new JLabel("Labels e Imagens", icone, JLabel.LEFT);
        label4.setFont(new Font("Serif", Font.BOLD, 20));
        label4.setForeground(Color.black);
        label4.setLocation(120, 100);
        label4.setSize(250, 50);
        
        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
    }

    public static void main(String args[]) {
        JFrame janela = new FrameLabel();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}