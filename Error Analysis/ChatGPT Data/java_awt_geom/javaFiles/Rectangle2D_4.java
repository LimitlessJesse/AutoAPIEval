import java.awt.geom.Rectangle2D;

public class Rectangle2D_4 {
    public static void main(String[] args) {
        Rectangle2D rectangle = new Rectangle2D.Double();
        rectangle.setRect(10.0, 10.0, 100.0, 50.0);
        System.out.println("X: " + rectangle.getX());
        System.out.println("Y: " + rectangle.getY());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
    }
}
