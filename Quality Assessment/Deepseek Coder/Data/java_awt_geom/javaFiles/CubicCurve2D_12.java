import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_12 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve = new CubicCurve2D.Float();
        cubicCurve.setCurve(0, 0, 10, 10, 20, 0, 30, 10);

        boolean contains = cubicCurve.contains(15, 5);
        System.out.println("The point (15, 5) is " + (contains? "contained" : "not contained") + " in the curve.");
    }
}
