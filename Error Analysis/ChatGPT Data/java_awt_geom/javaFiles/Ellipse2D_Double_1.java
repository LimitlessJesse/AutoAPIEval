import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_1 {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 100, 50);
        double x = ellipse.getX();
        System.out.println("X coordinate of the ellipse: " + x);
    }
}
