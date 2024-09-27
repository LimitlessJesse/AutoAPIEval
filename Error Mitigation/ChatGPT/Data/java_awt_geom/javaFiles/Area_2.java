import java.awt.geom.Area;
import java.awt.geom.Path2D;

public class Area_2 {
    public static void main(String[] args) {
        Area a1 = new Area(new Path2D.Double());
        a1.moveTo(0, 0);
        a1.lineTo(8, 0);
        a1.lineTo(0, 8);
        
        Area a2 = new Area(new Path2D.Double());
        a2.moveTo(0, 0);
        a2.lineTo(8, 0);
        a2.lineTo(8, 8);
        
        a1.subtract(a2);
        
        System.out.println("a1(before) - a2 = a1(after)");
        System.out.println(a1);
    }
}
