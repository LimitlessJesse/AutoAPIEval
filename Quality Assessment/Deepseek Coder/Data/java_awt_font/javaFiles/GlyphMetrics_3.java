import java.awt.Font;
import java.awt.font.GlyphMetrics;
import java.awt.font.TextLayout;

public class GlyphMetrics_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 14);
        TextLayout textLayout = new TextLayout("Hello", font, null);
        GlyphMetrics gm = textLayout.getGlyphMetrics(0);
        float lsb = gm.getLSB();
        System.out.println("Left Side Bearing: " + lsb);
    }
}
