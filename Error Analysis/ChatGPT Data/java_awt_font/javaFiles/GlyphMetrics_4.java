import java.awt.font.GlyphMetrics;

public class GlyphMetrics_4 {
    public static void main(String[] args) {
        // Sample code to demonstrate the use of float getRSB() method from GlyphMetrics
        GlyphMetrics glyphMetrics = new GlyphMetrics(0.5f, 0.3f, 0.1f);
        float rsb = glyphMetrics.getRSB();
        System.out.println("Right side bearing: " + rsb);
    }
}
