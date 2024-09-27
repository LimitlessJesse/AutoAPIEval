import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_3 {
    public static void main(String[] args) {
        // Create an instance of Ellipse2D.Double
        Ellipse2D.Double ellipse = new Ellipse2D.Double(10, 10, 50, 50);
        
        // Get the width of the ellipse
        double width = ellipse.getWidth();
        
        // Print the width
        System.out.println("The width of the ellipse is: " + width);
    }
}
