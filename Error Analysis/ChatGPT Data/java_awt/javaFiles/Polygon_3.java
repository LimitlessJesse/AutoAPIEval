import java.awt.Polygon;
import java.awt.Rectangle;

public class Polygon_3 {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addPoint(100, 100);
        polygon.addPoint(200, 100);
        polygon.addPoint(200, 200);
        
        Rectangle bounds = polygon.getBounds();
        System.out.println("Polygon bounds: " + bounds);
    }
}
