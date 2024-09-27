import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_3 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(1, 2, 3, 4, 5, 6);
        double ctrlY = quadCurve.getCtrlY();
        System.out.println("The y-coordinate of the control point is: " + ctrlY);
    }
}
