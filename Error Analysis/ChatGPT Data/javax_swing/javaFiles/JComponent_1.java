import javax.swing.*;
import java.awt.*;

public class JComponent_1 extends JComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setVisible(true);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Custom drawing
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);
    }
}
