import java.awt.geom.Arc2D;

public class Arc2D_Float_5 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float();
        arc.setAngleStart(45.0);
        System.out.println("Angle start: " + arc.getAngleStart());
    }
}
