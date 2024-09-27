import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_2 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double(10, 10, 50, 50);
        double height = rect.getHeight();
        System.out.println("Height of the rectangle: " + height);
    }
}
