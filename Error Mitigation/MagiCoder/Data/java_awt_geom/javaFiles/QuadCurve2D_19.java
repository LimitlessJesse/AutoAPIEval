import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_19 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        boolean contains = quadCurve.contains(5, 5, 5, 5);
        System.out.println(contains);
    }
}
