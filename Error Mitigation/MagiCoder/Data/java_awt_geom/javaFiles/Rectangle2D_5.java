import java.awt.geom.Rectangle2D;

public class Rectangle2D_5 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double(10, 10, 100, 100);
        System.out.println(rect.contains(50, 50));  // true
        System.out.println(rect.contains(150, 50)); // false
    }
}
