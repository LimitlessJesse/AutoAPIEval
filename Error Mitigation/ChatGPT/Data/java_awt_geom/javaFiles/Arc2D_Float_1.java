import java.awt.geom.Arc2D;

public class Arc2D_Float_1 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float(10.0f, 20.0f, 30.0f, 40.0f, 45.0, 90.0, Arc2D.OPEN);
        double angleExtent = arc.getAngleExtent();
        System.out.println("Angle Extent: " + angleExtent);
    }
}
