import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_2 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double(10, 20, 30, 40);
        double y = rect.getY();
        System.out.println("Y coordinate of the upper-left corner of the rectangle: " + y);
    }
}
