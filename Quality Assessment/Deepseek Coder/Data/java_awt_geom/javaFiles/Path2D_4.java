import java.awt.geom.Path2D;

public class Path2D_4 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();

        // Move the initial point
        path.moveTo(10, 10);

        // Create a quadratic curve from the current point to (20, 20) using (15, 15) as the control point
        path.quadTo(15, 15, 20, 20);

        System.out.println(path);
    }
}
