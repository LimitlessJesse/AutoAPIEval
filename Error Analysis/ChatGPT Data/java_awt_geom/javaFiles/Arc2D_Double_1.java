import java.awt.geom.Arc2D;

public class Arc2D_Double_1 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(0, 0, 100, 100, 45, 90, Arc2D.PIE);
        double angleExtent = arc.getAngleExtent();
        System.out.println("Angle Extent: " + angleExtent);
    }
}
