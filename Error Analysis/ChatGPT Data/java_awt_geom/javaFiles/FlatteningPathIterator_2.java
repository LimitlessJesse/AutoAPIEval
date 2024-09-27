import java.awt.geom.FlatteningPathIterator;

public class FlatteningPathIterator_2 {
    public static void main(String[] args) {
        FlatteningPathIterator pathIterator = new FlatteningPathIterator(null, 0.5);
        int recursionLimit = pathIterator.getRecursionLimit();
        System.out.println("Recursion limit: " + recursionLimit);
    }
}
