import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Path2D_18 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.append(new Rectangle2D.Double(0, 0, 100, 100), true);
        System.out.println(path);
    }
}
