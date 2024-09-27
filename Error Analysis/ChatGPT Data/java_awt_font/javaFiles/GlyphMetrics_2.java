import java.awt.font.GlyphMetrics;

public class GlyphMetrics_2 {
    public static void main(String[] args) {
        GlyphMetrics glyphMetrics = new GlyphMetrics(10.5f, 5.5f, true);
        float advanceY = glyphMetrics.getAdvanceY();
        System.out.println("Advance Y: " + advanceY);
    }
}
