import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_2 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(1, 2, 3, 4, 5, 6);
        double ctrlX = quadCurve.getCtrlX();
        System.out.println("The x-coordinate of the control point is: " + ctrlX);
    }
}
