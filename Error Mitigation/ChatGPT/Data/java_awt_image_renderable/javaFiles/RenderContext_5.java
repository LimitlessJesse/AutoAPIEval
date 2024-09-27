import java.awt.image.renderable.RenderContext;
import java.awt.RenderingHints;

public class RenderContext_5 {
    public static void main(String[] args) {
        RenderContext renderContext = new RenderContext(null, null);
        RenderingHints renderingHints = renderContext.getRenderingHints();
        System.out.println(renderingHints);
    }
}
