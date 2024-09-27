import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class FlatteningPathIterator_1 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));
        
        while (!iterator.isDone()) {
            float[] coords = new float[6];
            int type = iterator.currentSegment(coords);
            System.out.println("Type: " + type);
            System.out.println("Coordinates: " + new Point2D.Float(coords[0], coords[1]));
            iterator.next();
        }
    }
}
