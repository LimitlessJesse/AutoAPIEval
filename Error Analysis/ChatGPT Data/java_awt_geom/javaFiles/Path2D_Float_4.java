import java.awt.geom.Path2D;

public class Path2D_Float_4 {
    public static void main(String[] args) {
        Path2D.Float path = new Path2D.Float();
        path.moveTo(100, 100);
        path.curveTo(150, 150, 200, 100, 250, 200);
        // Use path for further operations
    }
}
