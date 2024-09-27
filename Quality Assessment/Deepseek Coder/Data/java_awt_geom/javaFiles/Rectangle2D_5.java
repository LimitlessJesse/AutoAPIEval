import java.awt.geom.Rectangle2D;

public class Rectangle2D_5 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double();
        rect.setFrame(10, 20, 30, 40);
        System.out.println("X: " + rect.getX());
        System.out.println("Y: " + rect.getY());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
    }
}
