import java.awt.font.GlyphVector;

public class GlyphVector_1 {
    public static void main(String[] args) {
        GlyphVector gv = new GlyphVector();
        int numGlyphs = gv.getNumGlyphs();
        System.out.println("Number of glyphs: " + numGlyphs);
    }
}
