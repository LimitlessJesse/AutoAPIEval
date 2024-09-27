import java.awt.Font;
import java.awt.font.GlyphVector;

public class GlyphVector_1 {
    public static void main(String[] args) {
        Font font = new Font("Serif", Font.PLAIN, 12);
        GlyphVector gv = font.createGlyphVector("Hello");
        int numGlyphs = gv.getNumGlyphs();
        System.out.println("Number of glyphs: " + numGlyphs);
    }
}
