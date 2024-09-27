import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;

public class FlatteningPathIterator_3 {
    public static void main(String[] args) {
        // Create a PathIterator object
        PathIterator pathIterator = new FlatteningPathIterator(null, 0);

        // Move the iterator to the next segment of the path forwards
        // along the primary direction of traversal as long as there are
        // more points in that direction
        pathIterator.next();
    }
}
