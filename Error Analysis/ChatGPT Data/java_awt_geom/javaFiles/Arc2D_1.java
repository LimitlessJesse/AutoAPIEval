import java.awt.geom.Arc2D;

public class Arc2D_1 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(0.0, 0.0, 100.0, 50.0, 45.0, 90.0, Arc2D.PIE);
        double angleExtent = arc.getAngleExtent();
        System.out.println("Angle Extent: " + angleExtent);
    }
}
