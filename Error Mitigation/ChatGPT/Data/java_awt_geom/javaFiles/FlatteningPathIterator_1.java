import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;

public class FlatteningPathIterator_1 {
    public static void main(String[] args) {
        FlatteningPathIterator pathIterator = new FlatteningPathIterator(null, 0.0);
        int windingRule = pathIterator.getWindingRule();
        System.out.println("Winding Rule: " + windingRule);
    }
}
