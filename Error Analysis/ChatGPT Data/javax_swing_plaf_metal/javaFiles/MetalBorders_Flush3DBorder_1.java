import javax.swing.*;
import java.awt.*;

public class MetalBorders_Flush3DBorder_1 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                super.paintBorder(c, g, x, y, width, height);
                
                MetalBorders.Flush3DBorder border = new MetalBorders.Flush3DBorder();
                border.paintBorder(c, g, x, y, width, height);
            }
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 300, 300);
            }
        };
        
        frame.add(panel);
    }
}
