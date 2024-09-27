import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;

public class Dimension2D_4 {
    public static void main(String[] args) {
        Dimension2D d = new Rectangle2D.Double(10, 20, 30, 40);
        Rectangle2D rect = new Rectangle2D.Double();
        rect.setSize(d);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
    }
}
