import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.GlyphVector;

public class GlyphVector_2 {
    public static void main(String[] args) {
        Font font = new Font("Times New Roman", Font.PLAIN, 12);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GlyphVector gv = font.createGlyphVector(ge.getDefaultScreenDevice().getDefaultConfiguration(), "Hello");
        int numGlyphs = gv.getNumGlyphs();
        System.out.println("Number of glyphs: " + numGlyphs);
    }
}
