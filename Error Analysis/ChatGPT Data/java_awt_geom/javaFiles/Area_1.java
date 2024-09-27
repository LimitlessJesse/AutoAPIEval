import java.awt.geom.Area;

public class Area_1 {
    public static void main(String[] args) {
        Area area1 = new Area();
        Area area2 = new Area();

        // Add area2 to area1
        area1.add(area2);

        System.out.println("Area 1: " + area1);
    }
}
