import java.awt.font.GlyphMetrics;

public class GlyphMetrics_1 {
    public static void main(String[] args) {
        GlyphMetrics glyphMetrics = new GlyphMetrics();
        float advance = glyphMetrics.getAdvance();
        System.out.println("Advance of the glyph: " + advance);
    }
}
