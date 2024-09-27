import java.awt.font.FontRenderContext;

public class FontRenderContext_3 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(null, false, false);
        boolean usesFractionalMetrics = frc.usesFractionalMetrics();
        System.out.println("Uses fractional metrics: " + usesFractionalMetrics);
    }
}
