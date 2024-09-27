import java.awt.font.GlyphVector;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class GlyphVector_1 {
    public static void main(String[] args) {
        // Create a GlyphVector
        // Assume gv is a valid GlyphVector object
        
        // Get the logical bounds of a specific glyph
        int glyphIndex = 0; // Specify the index of the glyph
        Shape logicalBounds = gv.getGlyphLogicalBounds(glyphIndex);
        
        // Print the logical bounds
        Rectangle2D bounds = logicalBounds.getBounds2D();
        System.out.println("Logical Bounds of Glyph " + glyphIndex + ": " + bounds);
    }
}
