import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_1 {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(10, 20, 30, 40);
        double x = ellipse.getX();
        System.out.println("X coordinate of the upper-left corner of the framing rectangle: " + x);
    }
}
