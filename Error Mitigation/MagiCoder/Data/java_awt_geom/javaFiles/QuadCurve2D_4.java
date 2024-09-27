import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_4 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        double x1 = quadCurve.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
