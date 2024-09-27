import java.awt.geom.Ellipse2D;

public class Ellipse2D_Float_4 {
    public static void main(String[] args) {
        Ellipse2D.Float ellipse = new Ellipse2D.Float(10.0f, 20.0f, 30.0f, 40.0f);
        double y = ellipse.getY();
        System.out.println("Y coordinate of the upper-left corner: " + y);
    }
}
