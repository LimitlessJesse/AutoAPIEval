import java.awt.Point;

public class Point_3 {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        System.out.println("Initial Point: " + point);

        point.setLocation(30, 40);
        System.out.println("Updated Point: " + point);
    }
}
