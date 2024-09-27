import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_5 {
    public static void main(String[] args) {
        RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(10, 10, 100, 50, 20, 20);
        roundRectangle.setFrame(20, 20, 120, 60);
        System.out.println("X: " + roundRectangle.getX() + ", Y: " + roundRectangle.getY() + ", Width: " + roundRectangle.getWidth() + ", Height: " + roundRectangle.getHeight());
    }
}
