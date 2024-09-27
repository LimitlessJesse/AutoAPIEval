import java.awt.geom.Area;

public class Area_3 {
    public static void main(String[] args) {
        Area area1 = new Area(new java.awt.Rectangle(0, 0, 100, 100));
        Area area2 = new Area(new java.awt.Rectangle(50, 50, 100, 100));
        
        area1.intersect(area2);
        
        System.out.println("Intersected Area: " + area1);
    }
}
