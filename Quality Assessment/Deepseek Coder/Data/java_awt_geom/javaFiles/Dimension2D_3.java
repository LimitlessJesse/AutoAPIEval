import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;

public class Dimension2D_3 {
    public static void main(String[] args) {
        Dimension2D dimension = new Rectangle2D.Double();
        dimension.setSize(100, 200);
        System.out.println("Width: " + dimension.getWidth());
        System.out.println("Height: " + dimension.getHeight());
    }
}
