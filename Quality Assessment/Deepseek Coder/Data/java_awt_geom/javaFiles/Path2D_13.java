import java.awt.geom.Path2D;

public class Path2D_13 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.append(new Rectangle2D.Double(10, 10, 50, 50), false);

        boolean intersects = path.intersects(5, 5, 10, 10);
        System.out.println("Intersects: " + intersects);
    }
}
