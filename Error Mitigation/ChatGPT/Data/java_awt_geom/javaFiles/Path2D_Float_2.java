import java.awt.geom.Path2D;

public class Path2D_Float_2 {
    public static void main(String[] args) {
        Path2D.Float path = new Path2D.Float();
        path.moveTo(0, 0);
        path.lineTo(50.5f, 50.5f);
        path.lineTo(100.0f, 0);
    }
}
