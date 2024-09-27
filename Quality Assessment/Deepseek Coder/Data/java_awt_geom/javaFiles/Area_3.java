import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_3 {
    public static void main(String[] args) {
        // Create two rectangles
        Rectangle2D rect1 = new Rectangle(10, 10, 20, 20);
        Rectangle2D rect2 = new Rectangle(15, 15, 20, 20);

        // Create two areas from the rectangles
        Area area1 = new Area(rect1);
        Area area2 = new Area(rect2);

        // Intersect the areas
        Area intersection = new Area(area1);
        intersection.intersect(area2);

        // Check if the intersection is empty
        if (intersection.isEmpty()) {
            System.out.println("The rectangles do not intersect");
        } else {
            System.out.println("The rectangles intersect");
        }
    }
}
