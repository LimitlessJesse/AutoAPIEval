import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;

public class GlyphVector_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        GlyphVector gv = font.createGlyphVector(frc, "Hello");
        
        for (int i = 0; i < gv.getNumGlyphs(); i++) {
            int glyphCode = gv.getGlyphCode(i);
            System.out.println("Glyph code at index " + i + ": " + glyphCode);
        }
    }
}
