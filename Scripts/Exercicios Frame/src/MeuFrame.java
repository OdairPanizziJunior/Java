
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {

    public static void main(String Args[]) {
        MeuFrame f = new MeuFrame();
        f.setVisible(true);
    }

    public MeuFrame() {

        setTitle("Cartão de Visitas");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(7, 27, 386, 216);
        g.setColor(Color.black);
        Font f1 = new Font("times new roman", Font.BOLD, 40);
        g.setFont(f1);
        g.drawString("Odair Júnior", 150, 80);
        Font f2 = new Font("arial", Font.PLAIN, 17);
        g.setFont(f2);
        g.drawString("Systems Analyst", 188, 110);
        Font f3 = new Font("arial", Font.PLAIN, 13);
        g.setFont(f3);
        g.drawString("Evergreen Terrace 742 | Springfield | Florida | USA", 55, 195);
        Font f4 = new Font("arial", Font.PLAIN, 13);
        g.setFont(f4);
        g.drawString("Tel: 00311 555 81101465", 125, 215);
        Font f5 = new Font("arial", Font.PLAIN, 13);
        g.setFont(f5);
        g.drawString("odairjunior@ftec.com", 135, 235);
         //vai ate definir outra cor
        //g.setColor(new Color(200,50,30)); //para construir cor RGB
        g.drawLine(130, 85, 385, 85);
        g.drawRect(6, 28, 387, 215);
        
        

        try {
            File arq = new File("img/imagem.jpg");
            Image img = ImageIO.read(arq);
            g.drawImage(img, 10, 32, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            File arq = new File("img/logo.jpg");
            Image img = ImageIO.read(arq);
            g.drawImage (img, 50, 145, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}
