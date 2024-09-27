import java.awt.font.GraphicAttribute;
import java.awt.geom.Rectangle2D;

public class GraphicAttribute_1 {
    public static void main(String[] args) {
        GraphicAttribute graphicAttribute = new GraphicAttribute(null, GraphicAttribute.ROMAN_BASELINE, 0, 0);
        Rectangle2D bounds = graphicAttribute.getBounds();
        System.out.println("Bounds: " + bounds);
    }
}
