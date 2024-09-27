import java.awt.geom.Arc2D;

public class Arc2D_2 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(10, 10, 20, 20, 45, 90, Arc2D.PIE);
        boolean intersects = arc.intersects(5, 5, 10, 10);
        System.out.println(intersects);
    }
}
