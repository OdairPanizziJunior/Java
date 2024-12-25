
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos extends JFrame {

        public Eventos() {
        initComponents();

    }
private void initComponents(){
    this.setTitle("Eventos");
    this.setSize(300, 300);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton btn = new JButton("Azul");
    JButton btn2 = new JButton("Vermelho");
    JButton btn3 = new JButton("Verde");
    JPanel panel = new JPanel();
    panel.add(btn);
    panel.add(btn2);
    panel.add(btn3);
    TratadorAction tratador = new TratadorAction();
    btn.addActionListener(tratador);
    btn2.addActionListener(tratador);
    btn3.addActionListener(tratador);
    this.add(panel, BorderLayout.NORTH);
    this.setVisible(true);
    
}

public static void main(String Args[]) {
        Eventos e = new Eventos();
        e.setVisible(true);
        
    }

}
