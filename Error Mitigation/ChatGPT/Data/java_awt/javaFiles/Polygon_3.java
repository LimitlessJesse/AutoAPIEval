import java.awt.Polygon;

public class Polygon_3 {
    public static void main(String[] args) {
        // Create a Polygon
        Polygon polygon = new Polygon();
        polygon.addPoint(100, 100);
        polygon.addPoint(200, 100);
        polygon.addPoint(200, 200);
        
        // Check if the specified coordinates are inside the Polygon
        int x = 150;
        int y = 150;
        boolean isInside = polygon.contains(x, y);
        
        System.out.println("Is point (" + x + ", " + y + ") inside the Polygon? " + isInside);
    }
}
