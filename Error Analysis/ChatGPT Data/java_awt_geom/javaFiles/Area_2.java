import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_2 {
    public static void main(String[] args) {
        // Create two Area objects
        Area area1 = new Area(new Rectangle2D.Double(0, 0, 100, 100));
        Area area2 = new Area(new Rectangle2D.Double(50, 50, 100, 100));
        
        // Subtract area2 from area1
        area1.subtract(area2);
        
        // Display result
        System.out.println(area1.getBounds2D());
    }
}
