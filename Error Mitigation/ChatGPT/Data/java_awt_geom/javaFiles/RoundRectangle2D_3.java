import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_3 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Double();
        roundRect.setRoundRect(10.0, 10.0, 100.0, 50.0, 20.0, 20.0);
        System.out.println("Round Rectangle: " + roundRect);
    }
}
