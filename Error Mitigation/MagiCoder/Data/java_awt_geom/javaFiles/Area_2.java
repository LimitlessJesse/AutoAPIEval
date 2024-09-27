import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Area_2 {
    public static void main(String[] args) {
        // Create an Area object
        Area area = new Area(new Ellipse2D.Double(0, 0, 100, 100));

        // Create a Point2D object
        Point2D point = new Point2D.Double(50, 50);

        // Check if the point is inside the area
        boolean isInside = area.contains(point);

        // Print the result
        System.out.println("Is the point inside the area? " + isInside);
    }
}
