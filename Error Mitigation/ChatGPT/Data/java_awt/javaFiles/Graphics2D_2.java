import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics2D_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                // Create a shape (in this case, an ellipse)
                Shape shape = new Ellipse2D.Double(100, 100, 200, 100);
                
                // Set the color to fill the shape
                g2d.setColor(Color.RED);
                
                // Fill the shape
                g2d.fill(shape);
            }
        };
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
