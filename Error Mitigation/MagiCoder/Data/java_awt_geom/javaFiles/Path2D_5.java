import java.awt.geom.Path2D;

public class Path2D_5 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 10);
        path.closePath();

        boolean contains = path.contains(15, 15);
        System.out.println(contains);
    }
}
