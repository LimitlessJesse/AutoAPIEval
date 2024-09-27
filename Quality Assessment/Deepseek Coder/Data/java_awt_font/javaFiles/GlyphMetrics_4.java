import java.awt.Font;
import java.awt.font.GlyphMetrics;
import java.awt.font.TextLayout;

public class GlyphMetrics_4 {
    public static void main(String[] args) {
        Font font = new Font("Serif", Font.PLAIN, 12);
        TextLayout textLayout = new TextLayout("Hello", font, null);
        GlyphMetrics gm = textLayout.getGlyphMetrics(0);
        float rsb = gm.getRSB();
        System.out.println("The right side bearing is: " + rsb);
    }
}
