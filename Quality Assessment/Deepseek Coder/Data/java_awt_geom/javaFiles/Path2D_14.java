import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Path2D_14 {
    public static void main(String[] args) {
        // Create a Path2D object
        Path2D path = new Path2D.Float();

        // Define a rectangle
        Rectangle2D rect = new Rectangle2D.Float(10, 10, 50, 50);

        // Add the rectangle to the path
        path.add(rect);

        // Create another rectangle
        Rectangle2D rect2 = new Rectangle2D.Float(20, 20, 20, 20);

        // Check if the path intersects with the second rectangle
        boolean intersects = path.intersects(rect2);

        // Print the result
        System.out.println("Does the path intersect with the second rectangle? " + intersects);
    }
}
