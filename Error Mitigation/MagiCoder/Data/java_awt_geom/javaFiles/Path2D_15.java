import java.awt.geom.Path2D;

public class Path2D_15 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        System.out.println("Path before reset: " + path);
        path.reset();
        System.out.println("Path after reset: " + path);
    }
}
