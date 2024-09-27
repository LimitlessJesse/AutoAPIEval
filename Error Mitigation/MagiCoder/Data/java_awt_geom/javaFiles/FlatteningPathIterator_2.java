import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;
import java.awt.geom.Path2D;

public class FlatteningPathIterator_2 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(0, 0);
        path.lineTo(10, 10);
        path.lineTo(20, 0);

        PathIterator iterator = path.getPathIterator(null);
        FlatteningPathIterator flatteningIterator = new FlatteningPathIterator(iterator);

        while (!flatteningIterator.isDone()) {
            flatteningIterator.next();
            // do something with the current segment
        }
    }
}
