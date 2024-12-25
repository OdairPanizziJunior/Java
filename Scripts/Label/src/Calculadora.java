

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField campo;

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Calculadora");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       campo = new JTextField(15);
        
        
        JButton btn1 = new JButton("1");
        btn1.addActionListener(this);
        
        
        JButton btn2 = new JButton("2");
        btn2.addActionListener(this);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(this);
        
        JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        
        JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        
        JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        
        JButton btn7 = new JButton("7");
        btn7.addActionListener(this);
        
        JButton btn8 = new JButton("8");
        btn8.addActionListener(this);
        
        JButton btn9 = new JButton("9");
        btn9.addActionListener(this);
        
         JButton btnzero = new JButton("0");
        btnzero.addActionListener(this);
        
        JButton btnmais = new JButton("+");
        btnmais.addActionListener(this);
        
        JButton btnmenos = new JButton("-");
        btnmenos.addActionListener(this);
        
        JButton btnvezes = new JButton("*");
        btnvezes.addActionListener(this);
        
        JButton btndividir = new JButton("/");
        btndividir.addActionListener(this);
        
        JButton btnigual = new JButton("=");
        btnigual.addActionListener(this);
        
        JButton btnponto = new JButton(".");
        btnponto.addActionListener(this);
        
         JButton btnce = new JButton("CE");
        btnce.addActionListener(this);


        JPanel painelcima = new JPanel();
        painelcima.add(campo);
        this.add(painelcima, BorderLayout.NORTH);
               
        
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5,4));
        painel.add(btnzero);
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(btn4);
        painel.add(btn5);
        painel.add(btn6);
        painel.add(btn7);
        painel.add(btn8);
        painel.add(btn9);
        painel.add(btnmais);
        painel.add(btnmenos);
        painel.add(btnvezes);
        painel.add(btndividir);
        painel.add(btnigual);
        painel.add(btnponto);
        painel.add(btnce);
        this.add(painel, BorderLayout.CENTER);
        
        
    }

    public static void main(String Args[]) {
        Calculadora frame = new Calculadora();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
}

   