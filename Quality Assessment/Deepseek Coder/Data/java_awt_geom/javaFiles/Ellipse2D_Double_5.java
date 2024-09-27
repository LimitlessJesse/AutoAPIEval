import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_5 {
    public static void main(String[] args) {
        // Create an instance of Ellipse2D.Double
        Ellipse2D.Double ellipse = new Ellipse2D.Double();

        // Set the frame of the ellipse
        ellipse.setFrame(10, 10, 50, 50);

        // Print the new frame of the ellipse
        System.out.println("X: " + ellipse.getX() + ", Y: " + ellipse.getY());
        System.out.println("Width: " + ellipse.getWidth() + ", Height: " + ellipse.getHeight());
    }
}
