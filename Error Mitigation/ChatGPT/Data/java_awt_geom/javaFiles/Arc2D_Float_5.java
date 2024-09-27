import java.awt.geom.Arc2D;

public class Arc2D_Float_5 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float(0, 0, 100, 100, 45, 90, Arc2D.OPEN);
        System.out.println("Initial Angle Extent: " + arc.getAngleExtent());
        
        arc.setAngleExtent(180);
        System.out.println("Updated Angle Extent: " + arc.getAngleExtent());
    }
}
