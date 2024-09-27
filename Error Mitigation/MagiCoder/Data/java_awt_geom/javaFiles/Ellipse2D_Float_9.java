import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ellipse2D_Float_9 {
    public static void main(String[] args) {
        Ellipse2D.Float ellipse = new Ellipse2D.Float(10, 10, 50, 50);
        Rectangle2D bounds = ellipse.getBounds2D();
        System.out.println("X: " + bounds.getX() + ", Y: " + bounds.getY() + ", Width: " + bounds.getWidth() + ", Height: " + bounds.getHeight());
    }
}
