import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Path2D_18 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.add(new Rectangle2D.Float(10, 10, 50, 50));

        Rectangle2D rect = new Rectangle2D.Float(20, 20, 20, 20);
        boolean contains = path.contains(rect);

        System.out.println("Does the path contain the rectangle? " + contains);
    }
}
