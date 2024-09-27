import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Path2D_Float_10 {
    public static void main(String[] args) {
        Path2D.Float path = new Path2D.Float();
        path.append(new Rectangle2D.Float(10, 10, 20, 20), false);
        Rectangle2D bounds = path.getBounds2D();
        System.out.println("X: " + bounds.getX() + ", Y: " + bounds.getY());
        System.out.println("Width: " + bounds.getWidth() + ", Height: " + bounds.getHeight());
    }
}
