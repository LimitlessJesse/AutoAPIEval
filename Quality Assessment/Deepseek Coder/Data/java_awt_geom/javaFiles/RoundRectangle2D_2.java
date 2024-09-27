import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_2 {
    public static void main(String[] args) {
        RoundRectangle2D rr = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        boolean result = rr.contains(20, 20);
        System.out.println(result);
    }
}
