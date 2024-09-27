import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_9 {
    public static void main(String[] args) {
        RoundRectangle2D rect = new RoundRectangle2D.Double(10, 10, 100, 100, 20, 20);
        boolean result = rect.contains(50, 50);
        System.out.println(result);
    }
}
