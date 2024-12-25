
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Saudacao extends JFrame implements ActionListener {

    private JTextField tfNome;

    public Saudacao() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Saudação");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel rotulo = new JLabel("Nome");
        tfNome = new JTextField(15);
        tfNome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirSaudacao();
            }
        });//não entendi NADA.

        JButton btnOK = new JButton("OK");
        btnOK.setToolTipText("Exibe a Saudação.");
        btnOK.addActionListener(this);


        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setToolTipText("Limpa o nome Informado.");
        btnLimpar.addActionListener(this);

        JPanel painel = new JPanel();
        painel.add(rotulo);
        painel.add(tfNome);
        painel.add(btnOK);
        painel.add(btnLimpar);
        painel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(),
                "Formulário"));
        this.add(painel, BorderLayout.CENTER);
        
        JPanel painelTopo = new JPanel();
        JLabel lblTitulo = new JLabel("Bem Vindo ao Java!");
        
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        painelTopo.add(lblTitulo);
        painelTopo.setBorder(BorderFactory.createRaisedBevelBorder());             
        
        this.add(painelTopo, BorderLayout.NORTH);
        
        JPanel painelBotton = new JPanel();
        painelBotton.setBorder(BorderFactory.createLoweredBevelBorder());
        this.add(painelBotton, BorderLayout.SOUTH);
                
        
        
    }

    public static void main(String Args[]) {
        Saudacao frame = new Saudacao();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("OK")) {
            exibirSaudacao();
        }
        if (e.getActionCommand().equals("Limpar")) {
            limparCampo();
        }

    }

    private void exibirSaudacao() {
        JOptionPane.showMessageDialog(null, "Ola " + tfNome.getText());
    }

    private void limparCampo() {
        this.tfNome.setText("");
    }
}
