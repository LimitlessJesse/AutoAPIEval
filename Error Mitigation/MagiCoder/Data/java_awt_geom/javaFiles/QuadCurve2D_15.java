import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class QuadCurve2D_15 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        Rectangle2D rect = new Rectangle2D.Double(5, 5, 10, 10);

        boolean contains = quadCurve.contains(rect);
        System.out.println("The quad curve contains the rectangle: " + contains);
    }
}
