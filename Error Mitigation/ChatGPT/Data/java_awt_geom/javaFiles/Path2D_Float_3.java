import java.awt.geom.Path2D;

public class Path2D_Float_3 {
    public static void main(String[] args) {
        Path2D.Float path = new Path2D.Float();
        path.moveTo(0, 0);
        path.quadTo(50, 50, 100, 0);
    }
}
