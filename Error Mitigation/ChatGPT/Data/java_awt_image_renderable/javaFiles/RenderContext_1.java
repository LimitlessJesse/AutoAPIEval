import java.awt.geom.AffineTransform;
import java.awt.image.renderable.RenderContext;

public class RenderContext_1 {
    public static void main(String[] args) {
        RenderContext renderContext = new RenderContext(new AffineTransform());
        AffineTransform transform = renderContext.getTransform();
        System.out.println("Current AffineTransform: " + transform);
    }
}
