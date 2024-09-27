import java.awt.geom.Ellipse2D;

public class Ellipse2D_Float_5 {
    public static void main(String[] args) {
        // Create an instance of Ellipse2D.Float
        Ellipse2D.Float ellipse = new Ellipse2D.Float();

        // Set the frame of the ellipse
        ellipse.setFrame(10, 10, 50, 50);

        // Print the frame of the ellipse
        System.out.println("X: " + ellipse.x + ", Y: " + ellipse.y);
        System.out.println("Width: " + ellipse.width + ", Height: " + ellipse.height);
    }
}
