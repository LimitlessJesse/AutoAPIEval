import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_3 {
    public static void main(String[] args) {
        RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        double arcHeight = roundRectangle.getArcHeight();
        System.out.println("Arc Height: " + arcHeight);
    }
}
