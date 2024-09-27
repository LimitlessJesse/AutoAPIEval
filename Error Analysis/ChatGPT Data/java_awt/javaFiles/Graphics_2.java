import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_2 extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawRect(g, 50, 50, 100, 100);
    }

    public void drawRect(Graphics g, int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Rectangle Example");
        frame.add(new Main());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
