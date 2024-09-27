import java.awt.geom.Path2D;

public class Path2D_8 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(100, 100);
        path.closePath();

        boolean contains = path.contains(50, 50, 10, 10);
        System.out.println(contains);
    }
}
