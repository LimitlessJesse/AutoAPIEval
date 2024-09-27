import java.awt.font.GlyphMetrics;

public class GlyphMetrics_3 {
    public static void main(String[] args) {
        GlyphMetrics glyphMetrics = new GlyphMetrics(10.5f, 5.3f, 3.2f, 1.1f, true);
        float lsb = glyphMetrics.getLSB();
        System.out.println("LSB: " + lsb);
    }
}
