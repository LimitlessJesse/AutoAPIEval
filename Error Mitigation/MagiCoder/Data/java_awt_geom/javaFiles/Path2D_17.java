import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Path2D_17 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(10, 10);
        path.lineTo(20, 0);
        path.closePath();

        AffineTransform at = AffineTransform.getScaleInstance(2, 2);
        path.transform(at);

        System.out.println(path);
    }
}
