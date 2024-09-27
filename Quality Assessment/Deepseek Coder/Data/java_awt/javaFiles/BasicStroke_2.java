import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class BasicStroke_2 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 10, new float[]{10, 20, 30, 40}, 0);
        Graphics2D g2d = null;
        Shape shape = new Rectangle2D.Float(10, 10, 100, 100);
        g2d.setStroke(stroke);
        g2d.draw(shape);
        float[] dashArray = stroke.getDashArray();
        for (float f : dashArray) {
            System.out.println(f);
        }
    }
}
