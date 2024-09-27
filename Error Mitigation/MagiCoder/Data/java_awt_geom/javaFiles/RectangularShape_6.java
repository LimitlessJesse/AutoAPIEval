import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangularShape_6 {
    public static void main(String[] args) {
        RectangularShape shape = new Rectangle(0, 0, 100, 100);
        Rectangle2D rect = new Rectangle(50, 50, 50, 50);
        System.out.println(shape.contains(rect));
    }
}
