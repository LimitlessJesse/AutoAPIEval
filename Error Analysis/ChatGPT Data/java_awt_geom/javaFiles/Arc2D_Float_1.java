import java.awt.geom.Arc2D;

public class Arc2D_Float_1 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float(1.0f, 2.0f, 100.0f, 200.0f, 45.0, 90.0, Arc2D.OPEN);
        double angleExtent = arc.getAngleExtent();
        System.out.println("Angle Extent: " + angleExtent);
    }
}
