import java.awt.geom.Ellipse2D;

public class Ellipse2D_Float_2 {
    public static void main(String[] args) {
        Ellipse2D.Float ellipse = new Ellipse2D.Float(0, 0, 100, 50);
        double width = ellipse.getWidth();
        System.out.println("Width of the ellipse: " + width);
    }
}
