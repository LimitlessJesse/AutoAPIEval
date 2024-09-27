import java.awt.geom.Arc2D;

public class Arc2D_Float_4 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        arc.setAngleExtent(90.0);
        System.out.println("Angle Extent: " + arc.getAngleExtent());
    }
}
