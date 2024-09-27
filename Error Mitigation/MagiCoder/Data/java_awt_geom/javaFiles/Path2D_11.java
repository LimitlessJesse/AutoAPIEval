import java.awt.geom.Path2D;

public class Path2D_11 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(100, 100);
        path.lineTo(100, 10);
        path.closePath();

        boolean intersects = path.intersects(50, 50, 100, 100);
        System.out.println("Intersects: " + intersects);
    }
}
