import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_4 {
    public static void main(String[] args) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 0, 10, 20);
        double height = rectangle.getHeight();
        System.out.println("Height of the rectangle: " + height);
    }
}
