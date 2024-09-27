import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Canvas_5 extends Canvas {
    
    public void paint(Graphics g) {
        // Drawing a red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);
        
        // Drawing a blue oval
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);
        
        // Drawing a black string
        g.setColor(Color.BLACK);
        g.drawString("Hello, World!", 100, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Canvas Example");
        Main canvas = new Main();
        frame.add(canvas);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
