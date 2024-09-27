import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class FlatteningPathIterator_4 {
    public static void main(String[] args) {
        // Create a Path2D object
        Path2D path = new Path2D.Double();

        // Add some points to the path
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 10);

        // Create a FlatteningPathIterator from the path
        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));

        // Create an array to hold the coordinates of the current segment
        double[] coords = new double[6];

        // Print the coordinates of each segment in the path
        while (!iterator.isDone()) {
            int segment = iterator.currentSegment(coords);
            System.out.println("Segment: " + segment);
            System.out.println("Coordinates: " + new Point2D.Double(coords[0], coords[1]) + ", " + new Point2D.Double(coords[2], coords[3]));
            iterator.next();
        }
    }
}
