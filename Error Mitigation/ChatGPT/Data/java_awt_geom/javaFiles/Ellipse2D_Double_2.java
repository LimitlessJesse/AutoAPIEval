import java.awt.geom.Ellipse2D;

public class Ellipse2D_Double_2 {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(10, 10, 100, 50);
        double y = ellipse.getY();
        System.out.println("Y coordinate of the upper-left corner: " + y);
    }
}
