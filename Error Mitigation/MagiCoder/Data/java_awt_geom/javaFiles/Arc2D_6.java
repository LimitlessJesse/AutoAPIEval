import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class Arc2D_6 {
    public static void main(String[] args) {
        // Create an Arc2D object
        Arc2D arc = new Arc2D.Double(0, 0, 100, 100, 0, 360, Arc2D.OPEN);

        // Create a Rectangle2D object
        Rectangle2D rect = new Rectangle2D.Double(20, 20, 60, 60);

        // Check if the arc contains the rectangle
        boolean result = arc.contains(rect);

        // Print the result
        System.out.println("Does the arc contain the rectangle? " + result);
    }
}
