import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;

public class FlatteningPathIterator_3 {
    public static void main(String[] args) {
        // Create a Path2D.Double object
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.curveTo(50, 50, 100, 0, 100, 100);

        // Create a FlatteningPathIterator
        PathIterator pathIterator = path.getPathIterator(null);
        FlatteningPathIterator flatteningIterator = new FlatteningPathIterator(pathIterator, 0.5);

        // Get the flatness value
        double flatness = flatteningIterator.getFlatness();
        System.out.println("Flatness value: " + flatness);
    }
}
