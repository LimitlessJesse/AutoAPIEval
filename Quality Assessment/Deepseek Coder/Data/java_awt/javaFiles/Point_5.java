import java.awt.Point;

public class Point_5 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(30, 40);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
