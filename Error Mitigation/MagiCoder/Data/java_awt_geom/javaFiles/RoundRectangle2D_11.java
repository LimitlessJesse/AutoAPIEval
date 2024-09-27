import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_11 {
    public static void main(String[] args) {
        RoundRectangle2D rect = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        boolean intersects = rect.intersects(20, 20, 20, 20);
        System.out.println(intersects);
    }
}
