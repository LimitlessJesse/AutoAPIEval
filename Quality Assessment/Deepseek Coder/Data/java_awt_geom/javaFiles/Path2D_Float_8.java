import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;

public class Path2D_Float_8 {
    public static void main(String[] args) {
        // Create a new Path2D.Float object
        Path2D.Float path = new Path2D.Float();

        // Add a rectangle to the path
        path.addRect(0, 0, 100, 100);

        // Create an AffineTransform object
        AffineTransform at = new AffineTransform();

        // Apply a transformation to the AffineTransform
        at.translate(50, 50);

        // Get a PathIterator for the path with the AffineTransform applied
        PathIterator pi = path.getPathIterator(at);

        // Print the path iterator
        while (!pi.isDone()) {
            int type = pi.currentSegment(null);
            System.out.println("Segment type: " + type);
            pi.next();
        }
    }
}
