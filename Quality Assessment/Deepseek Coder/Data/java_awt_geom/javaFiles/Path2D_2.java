import java.awt.geom.Path2D;

public class Path2D_2 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 20);
        System.out.println("Path: " + path);
    }
}
