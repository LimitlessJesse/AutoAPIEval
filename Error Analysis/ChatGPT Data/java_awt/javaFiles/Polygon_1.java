import java.awt.Polygon;

public class Polygon_1 {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addPoint(10, 20);
        polygon.addPoint(30, 40);
        System.out.println("Polygon points: " + polygon.npoints);
    }
}
