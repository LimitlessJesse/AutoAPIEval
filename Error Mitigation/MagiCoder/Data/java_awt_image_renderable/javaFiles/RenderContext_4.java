import java.awt.geom.AffineTransform;
import java.awt.image.renderable.RenderContext;

public class RenderContext_4 {
    public static void main(String[] args) {
        RenderContext renderContext = new RenderContext();
        AffineTransform transform = renderContext.getTransform();
        System.out.println(transform);
    }
}
