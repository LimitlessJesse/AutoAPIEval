import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Path2D_7 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(100, 100);
        path.lineTo(100, 10);
        path.closePath();

        Rectangle2D rect = new Rectangle2D.Double(15, 15, 80, 80);

        boolean contains = path.contains(rect);
        System.out.println("Does the path contain the rectangle? " + contains);
    }
}
