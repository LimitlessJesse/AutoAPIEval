import java.awt.Point;

public class Point_5 {
    public static void main(String[] args) {
        Point p = new Point(5, 5);
        System.out.println("Before translation: " + p);
        p.translate(3, 3);
        System.out.println("After translation: " + p);
    }
}
