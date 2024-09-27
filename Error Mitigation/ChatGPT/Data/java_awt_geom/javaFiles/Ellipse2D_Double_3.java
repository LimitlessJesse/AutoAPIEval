import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_3 {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 10, 20);
        double width = ellipse.getWidth();
        System.out.println("Width of the ellipse: " + width);
    }
}
