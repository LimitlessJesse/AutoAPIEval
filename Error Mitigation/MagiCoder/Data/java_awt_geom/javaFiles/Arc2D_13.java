import java.awt.geom.Arc2D;

public class Arc2D_13 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.PIE);
        boolean result = arc.contains(50, 50, 10, 10);
        System.out.println(result);
    }
}
