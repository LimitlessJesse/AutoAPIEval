import java.awt.geom.Area;
import java.awt.geom.Path2D;

public class Area_3 {
    public static void main(String[] args) {
        // Create two Area objects
        Area a1 = new Area(new Path2D.Double());
        a1.getPathIterator(null).currentSegment(new double[6]); // Add some shape to a1
        Area a2 = new Area(new Path2D.Double());
        a2.getPathIterator(null).currentSegment(new double[6]); // Add some shape to a2
        
        // Intersect the two Area objects
        a1.intersect(a2);
        
        // Print the resulting shape of a1
        System.out.println(a1);
    }
}
