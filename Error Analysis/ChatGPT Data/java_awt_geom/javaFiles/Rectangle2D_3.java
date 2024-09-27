import java.awt.geom.Rectangle2D;

public class Rectangle2D_3 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double();
        rect.setFrame(10, 10, 100, 50);
        System.out.println("Rectangle coordinates: (" + rect.getX() + ", " + rect.getY() + ")");
        System.out.println("Rectangle dimensions: " + rect.getWidth() + " x " + rect.getHeight());
    }
}
