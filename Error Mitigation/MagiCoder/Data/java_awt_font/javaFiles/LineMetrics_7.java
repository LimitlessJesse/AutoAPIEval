import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.font.TextLayout;

public class LineMetrics_7 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        String text = "Hello";
        TextLayout layout = new TextLayout(text, font, frc);
        LineMetrics lm = layout.getLineMetrics(0);
        float underlineOffset = lm.getUnderlineOffset();
        System.out.println("Underline Offset: " + underlineOffset);
    }
}
