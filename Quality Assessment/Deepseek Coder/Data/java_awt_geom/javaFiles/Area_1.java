import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_1 {
    public static void main(String[] args) {
        Area area = new Area(new Rectangle2D.Double(0, 0, 100, 100));
        boolean result = area.contains(50, 50);
        System.out.println(result);  // Output: true
    }
}
