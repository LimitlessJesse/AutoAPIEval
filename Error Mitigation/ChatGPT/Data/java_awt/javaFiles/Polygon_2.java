import java.awt.Polygon;
import java.awt.Rectangle;

public class Polygon_2 {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addPoint(100, 100);
        polygon.addPoint(200, 100);
        polygon.addPoint(200, 200);
        polygon.addPoint(100, 200);

        Rectangle bounds = polygon.getBounds();
        System.out.println("Bounding box of the Polygon: " + bounds);
    }
}
