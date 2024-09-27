import java.awt.geom.Path2D;

public class Path2D_Double_3 {
    public static void main(String[] args) {
        Path2D.Double path = new Path2D.Double();
        // Add a curved segment to the path
        path.curveTo(50, 50, 100, 100, 150, 150);
    }
}
