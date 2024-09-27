import java.awt.geom.Path2D;

public class Path2D_3 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.curveTo(50, 50, 100, 0, 100, 100);
    }
}
