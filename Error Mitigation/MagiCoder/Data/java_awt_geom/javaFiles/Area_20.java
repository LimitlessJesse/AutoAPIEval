import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_20 {
    public static void main(String[] args) {
        Area area = new Area(new Rectangle2D.Double(0, 0, 10, 10));
        System.out.println(area.isRectangular());
    }
}
