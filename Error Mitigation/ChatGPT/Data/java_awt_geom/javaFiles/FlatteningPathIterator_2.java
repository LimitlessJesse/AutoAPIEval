import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.PathIterator;

public class FlatteningPathIterator_2 {
    public static void main(String[] args) {
        FlatteningPathIterator fpi = new FlatteningPathIterator(null, 0.0);
        boolean done = fpi.isDone();
        System.out.println("Is iteration complete? " + done);
    }
}
