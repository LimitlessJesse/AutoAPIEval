import java.awt.Polygon;

public class Polygon_4 {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addPoint(100, 100);
        polygon.addPoint(200, 100);
        polygon.addPoint(200, 200);
        
        System.out.println("Before translation: " + polygon);
        
        polygon.translate(50, 50);
        
        System.out.println("After translation: " + polygon);
    }
}
