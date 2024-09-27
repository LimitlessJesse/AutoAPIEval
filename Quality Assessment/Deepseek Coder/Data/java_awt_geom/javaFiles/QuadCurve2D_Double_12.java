import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class QuadCurve2D_Double_12 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(1, 2, 3, 4, 5, 6);
        Rectangle2D bounds = quadCurve.getBounds2D();

        System.out.println("X: " + bounds.getX());
        System.out.println("Y: " + bounds.getY());
        System.out.println("Width: " + bounds.getWidth());
        System.out.println("Height: " + bounds.getHeight());
    }
}
