import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class LineMetrics_2 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        String text = "Hello";
        TextLayout layout = new TextLayout(text, font, frc);
        LineMetrics lm = layout.getLineMetrics(0);
        float descent = lm.getDescent();
        System.out.println("Descent: " + descent);
    }
}
