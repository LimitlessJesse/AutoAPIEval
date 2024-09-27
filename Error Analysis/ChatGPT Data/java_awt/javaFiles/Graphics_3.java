import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FillRect Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillRect(50, 50, 200, 100); // Fill a rectangle at x=50, y=50 with width=200 and height=100
            }
        };
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
