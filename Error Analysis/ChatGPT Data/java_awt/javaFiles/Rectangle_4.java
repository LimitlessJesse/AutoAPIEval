import java.awt.Rectangle;

public class Rectangle_4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 10, 50, 30);
        boolean containsPoint = rect.contains(20, 20);
        System.out.println("Does the rectangle contain point (20, 20)? " + containsPoint);
    }
}
