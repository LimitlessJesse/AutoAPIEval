import java.awt.geom.Path2D;

public class Path2D_Double_4 {
    public static void main(String[] args) {
        Path2D.Double path = new Path2D.Double();
        path.moveTo(0, 0);
        path.curveTo(50, 50, 100, 100, 150, 150);
    }
}
