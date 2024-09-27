import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_2 {
    public static void main(String[] args) {
        // Create an instance of Ellipse2D.Double
        Ellipse2D.Double ellipse = new Ellipse2D.Double(1, 2, 3, 4);
        
        // Get the y-coordinate of the center of the ellipse
        double y = ellipse.getY();
        
        // Print the y-coordinate
        System.out.println("The y-coordinate of the center of the ellipse is: " + y);
    }
}
