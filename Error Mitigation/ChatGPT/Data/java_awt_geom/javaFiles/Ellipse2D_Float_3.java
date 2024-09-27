import java.awt.geom.Ellipse2D;

public class Ellipse2D_Float_3 {
    public static void main(String[] args) {
        Ellipse2D.Float ellipse = new Ellipse2D.Float(10.0f, 20.0f, 30.0f, 40.0f);
        double x = ellipse.getX();
        System.out.println("X coordinate of the upper-left corner: " + x);
    }
}
