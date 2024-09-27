import java.awt.geom.Arc2D;

public class Arc2D_1 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(10, 10, 50, 50, 45, 90, Arc2D.PIE);
        boolean result = arc.contains(25, 25);
        System.out.println(result);
    }
}
