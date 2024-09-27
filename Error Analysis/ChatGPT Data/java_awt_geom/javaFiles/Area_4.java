import java.awt.geom.Area;

public class Area_4 {
    public static void main(String[] args) {
        Area area1 = new Area();
        Area area2 = new Area();
        
        // Perform exclusive OR operation
        area1.exclusiveOr(area2);
        
        // Display the result
        System.out.println("Result of exclusiveOr: " + area1);
    }
}
