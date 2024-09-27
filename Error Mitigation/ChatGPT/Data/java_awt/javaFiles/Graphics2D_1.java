import java.awt.*;
import java.awt.geom.*;

public class Graphics2D_1 {
    public static void main(String[] args) {
        // Create a new BufferedImage
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        
        // Get the Graphics2D object from the image
        Graphics2D g2d = image.createGraphics();
        
        // Create a rectangle shape
        Rectangle2D rect = new Rectangle2D.Double(50, 50, 100, 100);
        
        // Set the color to red
        g2d.setColor(Color.RED);
        
        // Draw the rectangle shape
        g2d.draw(rect);
        
        // Dispose of the Graphics2D object
        g2d.dispose();
        
        // Display the image
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
