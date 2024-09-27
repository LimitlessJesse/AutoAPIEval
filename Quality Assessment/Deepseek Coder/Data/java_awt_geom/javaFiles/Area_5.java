import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_5 {
    public static void main(String[] args) {
        // Create two rectangles
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 20, 20);
        Rectangle2D rect2 = new Rectangle2D.Double(15, 15, 20, 20);

        // Create two areas from the rectangles
        Area area1 = new Area(rect1);
        Area area2 = new Area(rect2);

        // Check if the areas intersect
        boolean intersects = area1.intersects(rect2.getBounds2D());

        // Print the result
        System.out.println("Do the areas intersect? " + intersects);
    }
}
