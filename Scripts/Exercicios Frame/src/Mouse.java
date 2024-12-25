
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class Mouse extends JFrame implements MouseListener {

    private int x, y;

    public Mouse() {

        super("Mouse");
        this.x = 50;
        this.y = 50;
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Java não é tão ruim assim", x, y);
    }

    public static void main(String args[]) {
        new Mouse();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.x = e.getPoint().x;
        this.y = e.getPoint().y;
        this.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}