import java.awt.Rectangle;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;

public class RectangularShape_8 {
    public static void main(String[] args) {
        RectangularShape shape = new Rectangle(0, 0, 100, 100);
        Rectangle2D rectangle = new Rectangle(50, 50, 100, 100);

        boolean intersects = shape.intersects(rectangle);
        System.out.println("Does the shape intersect the rectangle? " + intersects);
    }
}
