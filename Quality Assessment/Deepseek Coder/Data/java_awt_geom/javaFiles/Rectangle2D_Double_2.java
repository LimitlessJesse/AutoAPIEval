import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_2 {
    public static void main(String[] args) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(10, 20, 30, 40);
        double height = rectangle.getHeight();
        System.out.println("Height of the rectangle: " + height);
    }
}
