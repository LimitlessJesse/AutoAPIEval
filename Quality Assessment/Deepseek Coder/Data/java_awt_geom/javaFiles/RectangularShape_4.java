import java.awt.Rectangle;
import java.awt.geom.RectangularShape;

public class RectangularShape_4 {
    public static void main(String[] args) {
        RectangularShape shape1 = new Rectangle(0, 0, 10, 10);
        RectangularShape shape2 = new Rectangle(5, 5, 10, 10);
        
        boolean intersects = shape1.intersects(shape2.getBounds2D());
        System.out.println("Do the two rectangles intersect? " + intersects);
    }
}
