import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_3 {
    public static void main(String[] args) {
        QuadCurve2D q = new QuadCurve2D.Float();
        q.setCurve(0, 0, 10, 10, 20, 0);
        double y1 = q.getY1();
        System.out.println("The y-coordinate of the control point is: " + y1);
    }
}
