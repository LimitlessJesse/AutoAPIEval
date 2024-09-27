import java.awt.Point;

public class Point_4 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);

        System.out.println("Before setLocation: " + p1);
        p1.setLocation(p2);
        System.out.println("After setLocation: " + p1);
    }
}
