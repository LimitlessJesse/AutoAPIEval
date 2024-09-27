import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_4 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Double();
        roundRect.setFrame(10.0, 10.0, 100.0, 50.0);
        System.out.println("X: " + roundRect.getX());
        System.out.println("Y: " + roundRect.getY());
        System.out.println("Width: " + roundRect.getWidth());
        System.out.println("Height: " + roundRect.getHeight());
    }
}
