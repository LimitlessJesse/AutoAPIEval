import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;

public class FlatteningPathIterator_5 {
    public static void main(String[] args) {
        // Create a FlatteningPathIterator
        FlatteningPathIterator iterator = new FlatteningPathIterator(null, null);

        // Get the winding rule
        int windingRule = iterator.getWindingRule();

        // Print the winding rule
        System.out.println("Winding rule: " + windingRule);
    }
}
