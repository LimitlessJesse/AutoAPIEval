import java.awt.geom.Rectangle2D;

public class Rectangle2D_3 {
    public static void main(String[] args) {
        Rectangle2D rectangle = new Rectangle2D.Double();
        rectangle.setRect(10.0, 10.0, 100.0, 50.0);
        System.out.println("Rectangle X: " + rectangle.getX());
        System.out.println("Rectangle Y: " + rectangle.getY());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Rectangle Height: " + rectangle.getHeight());
    }
}
