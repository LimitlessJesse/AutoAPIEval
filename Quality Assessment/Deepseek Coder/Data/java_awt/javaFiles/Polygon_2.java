import java.awt.Polygon;

public class Polygon_2 {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addPoint(50, 50);
        polygon.addPoint(100, 100);
        polygon.addPoint(150, 50);
        
        System.out.println("Points of the Polygon:");
        for (int i = 0; i < polygon.npoints; i++) {
            System.out.println("Point " + (i+1) + ": (" + polygon.xpoints[i] + ", " + polygon.ypoints[i] + ")");
        }
    }
}
