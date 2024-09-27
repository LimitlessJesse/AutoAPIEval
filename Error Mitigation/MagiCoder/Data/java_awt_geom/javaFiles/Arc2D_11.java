import java.awt.geom.Arc2D;

public class Arc2D_11 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.PIE);
        boolean intersects = arc.intersects(50, 50, 100, 100);
        System.out.println(intersects);
    }
}
