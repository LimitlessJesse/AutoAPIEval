import java.awt.geom.Area;
import java.awt.geom.Path2D;

public class Area_4 {
    public static void main(String[] args) {
        // Create two Area objects
        Area a1 = new Area(new Path2D.Double());
        a1.moveTo(0, 0);
        a1.lineTo(8, 0);
        a1.lineTo(0, 8);
        a1.closePath();

        Area a2 = new Area(new Path2D.Double());
        a2.moveTo(0, 0);
        a2.lineTo(8, 0);
        a2.lineTo(8, 8);
        a2.closePath();

        // Perform exclusiveOr operation
        a1.exclusiveOr(a2);

        // Print the resulting Area
        System.out.println(a1);
    }
}
