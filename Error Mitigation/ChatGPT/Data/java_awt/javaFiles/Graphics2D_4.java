import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class Graphics2D_4 {
    public static void main(String[] args) {
        Graphics2D graphics2D = null; // Initialize your Graphics2D object
        
        // Create a BasicStroke object
        Stroke stroke = new BasicStroke(2.0f); // Specify the width of the stroke
        
        // Set the Stroke for the Graphics2D context
        graphics2D.setStroke(stroke);
    }
}
