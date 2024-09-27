import java.awt.font.FontRenderContext;

public class FontRenderContext_5 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(null, true, true);
        boolean usesFractionalMetrics = frc.usesFractionalMetrics();
        System.out.println("Uses fractional metrics: " + usesFractionalMetrics);
    }
}
