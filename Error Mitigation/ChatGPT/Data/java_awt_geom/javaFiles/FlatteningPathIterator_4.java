import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;
import java.util.NoSuchElementException;

public class FlatteningPathIterator_4 {
    public static void main(String[] args) {
        float[] coords = new float[6];
        FlatteningPathIterator pathIterator = new FlatteningPathIterator(/* pass your PathIterator object here */);
        
        try {
            int segmentType = pathIterator.currentSegment(coords);
            System.out.println("Segment Type: " + segmentType);
            for (int i = 0; i < coords.length; i += 2) {
                System.out.println("Point " + (i / 2 + 1) + ": (" + coords[i] + ", " + coords[i + 1] + ")");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No more elements in the flattening path to be returned.");
        }
    }
}
