
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame01 extends JFrame {

    public static void main(String Args[]) {
        Frame01 f = new Frame01();
    f.setVisible(true);
    }
    public Frame01(){
        setTitle("Meu Frame");
        setSize(300, 300);
        //setLocation(50, 50); tira esse para usar o RelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /*
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    set Size(d.width/2, d.height/2);                "pode se usar o Toolkit para
    set Location(d.width/4, d.height/4);            quando não se sabe a resulição da tela"
    
    */          

}
    