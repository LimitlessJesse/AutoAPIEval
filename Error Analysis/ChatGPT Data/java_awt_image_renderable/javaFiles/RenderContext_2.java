import java.awt.RenderingHints;
import java.awt.image.renderable.RenderContext;

public class RenderContext_2 {
    public static void main(String[] args) {
        RenderContext renderContext = new RenderContext(null, null);
        RenderingHints renderingHints = renderContext.getRenderingHints();
        System.out.println(renderingHints);
    }
}
