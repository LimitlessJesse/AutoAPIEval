import java.awt.font.GlyphMetrics;

public class GlyphMetrics_1 {
    public static void main(String[] args) {
        GlyphMetrics glyphMetrics = new GlyphMetrics(10.5f, 5.2f, 2.0f);
        float advanceX = glyphMetrics.getAdvanceX();
        System.out.println("AdvanceX: " + advanceX);
    }
}
