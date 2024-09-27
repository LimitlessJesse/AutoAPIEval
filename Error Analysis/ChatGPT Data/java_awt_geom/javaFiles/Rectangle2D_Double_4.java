import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_4 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double();
        rect.setRect(10.0, 10.0, 100.0, 50.0);
        System.out.println("Rectangle X: " + rect.getX());
        System.out.println("Rectangle Y: " + rect.getY());
        System.out.println("Rectangle Width: " + rect.getWidth());
        System.out.println("Rectangle Height: " + rect.getHeight());
    }
}
