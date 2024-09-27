import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_5 {
    public static void main(String[] args) {
        Area area = new Area();
        Rectangle2D rect = new Rectangle2D.Double(10, 10, 50, 50);
        area.add(new Area(rect));

        Rectangle2D rect2 = new Rectangle2D.Double(20, 20, 50, 50);
        boolean intersects = area.intersects(rect2);

        System.out.println("Does the area intersect with rect2? " + intersects);
    }
}
