import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;

public class GlyphVector_5 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontMetrics fontMetrics = new FontMetrics(font) {
        };

        Graphics graphics = null;
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        String text = "Hello World";
        FontRenderContext frc = g2d.getFontRenderContext();
        GlyphVector glyphVector = font.createGlyphVector(frc, text);

        int beginGlyphIndex = 0;
        int numEntries = glyphVector.getNumGlyphs();
        float[] positions = new float[numEntries * 2];
        float[] finalPositions = glyphVector.getGlyphPositions(beginGlyphIndex, numEntries, positions);
        for (int i = 0; i < finalPositions.length; i += 2) {
            System.out.println("Glyph " + i/2 + " at X: " + finalPositions[i] + ", Y: " + finalPositions[i+1]);
        }
    }
}
