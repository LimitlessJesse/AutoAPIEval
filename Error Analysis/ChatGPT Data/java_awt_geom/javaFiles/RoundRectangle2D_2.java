import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_2 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(10, 10, 100, 50, 20, 20);
        double arcHeight = roundRect.getArcHeight();
        System.out.println("Arc Height: " + arcHeight);
    }
}
