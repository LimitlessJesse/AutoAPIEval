import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_2 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        double ctrlX = quadCurve.getCtrlX();
        System.out.println("X coordinate of the control point: " + ctrlX);
    }
}
