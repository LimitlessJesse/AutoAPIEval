import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class BasicStroke_1 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(5.0f);
        float lineWidth = stroke.getLineWidth();
        System.out.println("Line Width: " + lineWidth);
    }
}
