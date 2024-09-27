import java.awt.Rectangle;

public class Rectangle_4 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(5, 5, 10, 10);
        
        boolean result = rect1.intersects(rect2);
        System.out.println("Do the rectangles intersect? " + result);
    }
}
