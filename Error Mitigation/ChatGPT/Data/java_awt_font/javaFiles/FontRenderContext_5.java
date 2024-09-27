import java.awt.FontRenderContext;
import java.awt.RenderingHints;

public class FontRenderContext_5 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(null, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT, RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT);
        Object antiAliasingHint = frc.getAntiAliasingHint();
        System.out.println("Text anti-aliasing rendering mode hint: " + antiAliasingHint);
    }
}
