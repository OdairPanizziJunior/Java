
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos2 extends JFrame implements ActionListener {

        public Eventos2() {
        initComponents();

    }
private void initComponents(){
    this.setTitle("Eventos");
    this.setSize(400, 400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton btn = new JButton("Azul");
    JButton btn2 = new JButton("Vermelho");
    JButton btn3 = new JButton("Verde");
    JButton btn4 = new JButton("Amarelo");
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,1));
    panel.add(btn);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(btn4);
    btn.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    this.add(panel, BorderLayout.EAST);
    this.setVisible(true);
    
}

public static void main(String Args[]) {
        Eventos2 e = new Eventos2();
        e.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("Azul")){
            this.getContentPane().setBackground(Color.BLUE);
        }
         if(cmd.equals("Vermelho")){
            this.getContentPane().setBackground(Color.RED);
        }
         if(cmd.equals("Verde")){
            this.getContentPane().setBackground(Color.GREEN);
        }
         if(cmd.equals("Amarelo")){
            this.getContentPane().setBackground(Color.YELLOW);
        }
           }

}
