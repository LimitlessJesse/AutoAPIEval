import java.awt.font.GlyphMetrics;

public class GlyphMetrics_2 {
    public static void main(String[] args) {
        GlyphMetrics glyphMetrics = new GlyphMetrics();
        float leftSideBearing = glyphMetrics.getLSB();
        System.out.println("Left Side Bearing: " + leftSideBearing);
    }
}
