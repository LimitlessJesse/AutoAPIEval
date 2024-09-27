import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_3 {
    public static void main(String[] args) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 0, 10, 5);
        double width = rectangle.getWidth();
        System.out.println("Width of the rectangle: " + width);
    }
}
