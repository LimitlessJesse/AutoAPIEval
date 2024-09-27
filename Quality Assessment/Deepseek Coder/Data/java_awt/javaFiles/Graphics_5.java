import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Graphics_5 extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Graphics_5());
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(50, 50, 100, 100);
    }
}
