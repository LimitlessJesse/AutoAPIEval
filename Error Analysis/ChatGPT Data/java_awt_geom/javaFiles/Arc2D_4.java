import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class Arc2D_4 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.OPEN);
        Rectangle2D bounds = arc.getBounds2D();
        System.out.println("Bounds: " + bounds);
    }
}
