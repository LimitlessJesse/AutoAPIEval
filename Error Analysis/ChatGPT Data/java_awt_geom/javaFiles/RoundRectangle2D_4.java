import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_4 {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 10.0;
        double width = 100.0;
        double height = 50.0;
        double arcWidth = 20.0;
        double arcHeight = 20.0;

        RoundRectangle2D roundRect = new RoundRectangle2D.Double();
        roundRect.setRoundRect(x, y, width, height, arcWidth, arcHeight);

        System.out.println("Round Rectangle: x=" + roundRect.getX() + ", y=" + roundRect.getY() + ", width=" + roundRect.getWidth() + ", height=" + roundRect.getHeight() + ", arcWidth=" + roundRect.getArcWidth() + ", arcHeight=" + roundRect.getArcHeight());
    }
}
