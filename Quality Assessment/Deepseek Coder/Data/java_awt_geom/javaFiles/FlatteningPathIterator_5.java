import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;

public class FlatteningPathIterator_5 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(40, 40);
        path.closePath();

        PathIterator iterator = path.getPathIterator(null);
        FlatteningPathIterator flatteningIterator = new FlatteningPathIterator(iterator);

        int windingRule = flatteningIterator.getWindingRule();
        System.out.println("Winding rule: " + windingRule);
    }
}
