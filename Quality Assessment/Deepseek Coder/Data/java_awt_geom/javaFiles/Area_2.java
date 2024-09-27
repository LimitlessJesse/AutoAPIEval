import java.awt.Point;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_2 {
    public static void main(String[] args) {
        // Create a new Area
        Area area = new Area();

        // Create a new Rectangle2D
        Rectangle2D rect = new Rectangle2D.Double(10, 10, 20, 20);

        // Add the Rectangle2D to the Area
        area.add(rect);

        // Create a new Point
        Point point = new Point(20, 20);

        // Check if the Area contains the Point
        boolean contains = area.contains(point.getX(), point.getY());

        // Print the result
        System.out.println("Does the Area contain the Point? " + contains);
    }
}
