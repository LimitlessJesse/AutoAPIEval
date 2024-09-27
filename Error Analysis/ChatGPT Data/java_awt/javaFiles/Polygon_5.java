import java.awt.Polygon;

public class Polygon_5 {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addPoint(100, 100);
        polygon.addPoint(200, 100);
        polygon.addPoint(200, 200);

        System.out.println("Before reset: " + polygon);

        polygon.reset();

        System.out.println("After reset: " + polygon);
    }
}
