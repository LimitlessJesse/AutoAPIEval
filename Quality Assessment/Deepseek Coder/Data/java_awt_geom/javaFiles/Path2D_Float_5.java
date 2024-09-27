import java.awt.geom.Path2D;

public class Path2D_Float_5 {
    public static void main(String[] args) {
        Path2D.Float path = new Path2D.Float();
        path.moveTo(10, 10);
        path.curveTo(20, 20, 30, 0, 40, 10);
        System.out.println(path);
    }
}
