import java.awt.RenderingHints;
import java.awt.image.renderable.RenderContext;

public class RenderContext_12 {
    public static void main(String[] args) {
        RenderContext renderContext = new RenderContext();
        RenderingHints renderingHints = renderContext.getRenderingHints();
        System.out.println(renderingHints);
    }
}
