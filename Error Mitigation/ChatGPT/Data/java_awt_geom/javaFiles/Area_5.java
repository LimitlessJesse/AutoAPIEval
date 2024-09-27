import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_5 {
    public static void main(String[] args) {
        Area area = new Area(); // Create an instance of Area
        Rectangle2D bounds = area.getBounds2D(); // Get the bounding Rectangle2D
        System.out.println("Bounding Rectangle: " + bounds);
    }
}
