import java.awt.geom.Arc2D;

public class Arc2D_Float_3 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float(10, 10, 100, 100, 45, 90, Arc2D.OPEN);
        System.out.println("Start Angle: " + arc.getAngleStart());
    }
}
