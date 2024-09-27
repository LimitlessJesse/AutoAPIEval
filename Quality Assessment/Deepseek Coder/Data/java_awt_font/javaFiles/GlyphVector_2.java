import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;

public class GlyphVector_2 {
    public static void main(String[] args) {
        // Create a font
        Font font = new Font("Serif", Font.PLAIN, 12);

        // Create a font render context
        FontRenderContext frc = new FontRenderContext(null, true, true);

        // Create a glyph vector
        GlyphVector gv = font.createGlyphVector(frc, "Hello");

        // Get the glyph metrics
        java.awt.font.GlyphMetrics gm = gv.getGlyphMetrics(0);

        // Print the glyph metrics
        System.out.println("Advance: " + gm.getAdvance());
        System.out.println("Bounds: " + gm.getBounds());
        System.out.println("Bounds2D: " + gm.getBounds2D());
        System.out.println("Lsb: " + gm.getLsb());
        System.out.println("Rsb: " + gm.getRsb());
        System.out.println("Width: " + gm.getWidth());
    }
}
