
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Teclado extends JFrame implements KeyListener {

    private String texto;
    private int x, y;

    public Teclado() {
        super("Teclado");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addKeyListener(this);
        this.x = 50;
        this.y = 50;
        this.texto = "";

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(texto, x, y);
    }

    public static void main(String args[]) {
        new Teclado();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        texto = texto + e.getKeyChar();
        this.repaint();

    }

    @Override
    public void keyPressed(KeyEvent e) {
    
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x-=5;
            
           
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x+=5;
        if(x > (this.getWidth() - 50)){
                x = this.getWidth() - 50;
            }    
        
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y+=5;
          
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y-=5;
          
        }
    this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
