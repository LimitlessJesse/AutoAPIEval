import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_1 {
    public static void main(String[] args) {
        // Create an instance of Ellipse2D.Double
        Ellipse2D.Double ellipse = new Ellipse2D.Double(1, 2, 3, 4);
        
        // Get the x-coordinate of the center of the ellipse
        double x = ellipse.getX();
        
        // Print the x-coordinate
        System.out.println("The x-coordinate of the center of the ellipse is: " + x);
    }
}
