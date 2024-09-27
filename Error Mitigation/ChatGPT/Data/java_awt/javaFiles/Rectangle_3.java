import java.awt.Rectangle;

public class Rectangle_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setRect(10.0, 10.0, 50.0, 30.0);
        System.out.println("Rectangle coordinates: " + rectangle.getX() + ", " + rectangle.getY());
        System.out.println("Rectangle dimensions: " + rectangle.getWidth() + " x " + rectangle.getHeight());
    }
}
