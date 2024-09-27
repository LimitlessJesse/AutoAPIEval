import java.awt.Graphics;
import javax.swing.JFrame;

public class Graphics_1 extends JFrame {
    
    public Main() {
        setTitle("Draw Line Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(50, 50, 200, 200); // Draws a line from (50, 50) to (200, 200)
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}
