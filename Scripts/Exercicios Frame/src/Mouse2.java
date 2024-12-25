
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class Mouse2 extends JFrame implements MouseMotionListener {

    private int x, y;

    public Mouse2() {

        super("Mouse");
        this.x = 50;
        this.y = 50;
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addMouseMotionListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Java não é tão ruim assim", x, y);
    }

    public static void main(String args[]) {
        new Mouse2();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.x = e.getPoint().x;
        this.y = e.getPoint().y;
        this.repaint();

    }
}
