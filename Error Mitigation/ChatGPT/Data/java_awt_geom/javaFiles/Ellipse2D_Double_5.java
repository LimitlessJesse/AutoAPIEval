import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_5 {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(10, 10, 100, 50);
        Rectangle2D bounds = ellipse.getBounds2D();
        System.out.println("Bounding box of the ellipse: " + bounds);
    }
}
