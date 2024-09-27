import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;

public class Dimension2D_3 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double();
        rect.setSize(100, 200);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
    }
}
