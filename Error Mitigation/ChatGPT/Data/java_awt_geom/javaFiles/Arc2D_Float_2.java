import java.awt.geom.Arc2D;

public class Arc2D_Float_2 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float(0, 0, 100, 100, 45, 90, Arc2D.OPEN);
        double angleStart = arc.getAngleStart();
        System.out.println("Starting angle of the arc: " + angleStart);
    }
}
