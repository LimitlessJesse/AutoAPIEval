import java.awt.geom.AffineTransform;
import java.awt.image.renderable.RenderContext;

public class RenderContext_3 {
    public static void main(String[] args) {
        AffineTransform affineTransform = new AffineTransform();
        RenderContext renderContext = new RenderContext(affineTransform);
        AffineTransform transform = renderContext.getTransform();
        System.out.println("Original Transform: " + transform);
    }
}
