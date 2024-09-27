import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_4 {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 10, 20);
        double height = ellipse.getHeight();
        System.out.println("Height of the ellipse: " + height);
    }
}
