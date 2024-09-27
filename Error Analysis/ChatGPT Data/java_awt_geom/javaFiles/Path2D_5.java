import java.awt.geom.Path2D;

public class Path2D_5 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(10, 10);
        
        boolean containsPoint = path.contains(5, 5);
        System.out.println("Point (5, 5) is inside the path: " + containsPoint);
    }
}
