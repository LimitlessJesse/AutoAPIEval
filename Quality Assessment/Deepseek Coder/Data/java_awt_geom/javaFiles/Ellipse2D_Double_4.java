import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_4 {
    public static void main(String[] args) {
        // Create a new Ellipse2D.Double object
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 10, 20);
        
        // Get the height of the ellipse
        double height = ellipse.getHeight();
        
        // Print the height
        System.out.println("The height of the ellipse is: " + height);
    }
}
