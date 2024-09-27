import java.awt.font.GlyphMetrics;

public class GlyphMetrics_3 {
    public static void main(String[] args) {
        GlyphMetrics glyphMetrics = new GlyphMetrics();
        float rsb = glyphMetrics.getRSB();
        System.out.println("Right Side Bearing: " + rsb);
    }
}
