import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class FlatteningPathIterator_3 {
    public static void main(String[] args) {
        // Create a Path2D object
        Path2D path = new Path2D.Float();

        // Add some points to the path
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 10);

        // Create a FlatteningPathIterator from the path
        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));

        // Create an array to hold the coordinates of the current segment
        float[] coords = new float[6];

        // Get the current segment
        int segment = iterator.currentSegment(coords);

        // Print the coordinates of the current segment
        System.out.println("Current segment: " + segment);
        System.out.println("Coordinates: " + java.util.Arrays.toString(coords));
    }
}
