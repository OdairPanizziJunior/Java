
//import java.awt.Window;
import javax.swing.JFrame;

public class DemoGui {

    public static void main(String Args[]) {
        JFrame f = new JFrame(); //pode se usar o "Window f = new Window(null);  Importar awt..."
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
