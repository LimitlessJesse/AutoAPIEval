import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_1 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Float();
        roundRect.setRoundRect(10, 10, 50, 50, 10, 10);
        System.out.println(roundRect);
    }
}
