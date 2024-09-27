import java.awt.geom.Arc2D;

public class Arc2D_2 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(10, 10, 100, 100, 45, 90, Arc2D.PIE);
        double startAngle = arc.getAngleStart();
        System.out.println("Starting angle of the arc: " + startAngle);
    }
}
