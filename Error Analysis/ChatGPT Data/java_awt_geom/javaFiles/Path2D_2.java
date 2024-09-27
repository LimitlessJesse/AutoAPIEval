import java.awt.geom.Path2D;

public class Path2D_2 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(100, 100);
        System.out.println(path);
    }
}
