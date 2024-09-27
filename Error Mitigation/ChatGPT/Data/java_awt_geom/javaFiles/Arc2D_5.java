import java.awt.geom.Arc2D;

public class Arc2D_5 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(10, 10, 50, 50, 45, 90, Arc2D.PIE);
        int arcType = arc.getArcType();
        System.out.println("Arc Type: " + arcType);
    }
}
