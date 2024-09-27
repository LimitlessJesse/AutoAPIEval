import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Graphics2D_4 {
    public static void main(String[] args) {
        Ellipse2D ellipse = new Ellipse2D.Double(50, 50, 200, 100);
        
        Graphics2D g2d = null; // Initialize your Graphics2D object
        
        g2d.setColor(Color.BLUE);
        g2d.fill(ellipse);
    }
}
