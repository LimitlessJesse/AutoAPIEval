import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;
import java.awt.geom.Path2D;

public class FlatteningPathIterator_4 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 10);
        path.closePath();

        PathIterator iterator = path.getPathIterator(null);
        FlatteningPathIterator flatteningIterator = new FlatteningPathIterator(iterator);

        float[] coords = new float[6];
        int type = flatteningIterator.currentSegment(coords);

        System.out.println("Type: " + type);
        System.out.println("Coordinates: ");
        for (float coord : coords) {
            System.out.println(coord);
        }
    }
}
