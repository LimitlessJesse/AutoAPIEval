import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;

public class Path2D_Double_9 {
    public static void main(String[] args) {
        // Create a new Path2D.Double object
        Path2D.Double path = new Path2D.Double();

        // Add a rectangle to the path
        path.addRect(10, 10, 50, 50);

        // Create an AffineTransform object
        AffineTransform at = new AffineTransform();

        // Apply a transformation to the AffineTransform
        at.translate(20, 20);

        // Get a PathIterator for the path with the transformation applied
        PathIterator pi = path.getPathIterator(at);

        // Print the path iterator
        while (!pi.isDone()) {
            int type = pi.currentSegment(null);
            System.out.println("Segment type: " + type);
            pi.next();
        }
    }
}
