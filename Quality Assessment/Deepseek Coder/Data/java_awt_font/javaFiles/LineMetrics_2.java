import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

public class LineMetrics_2 {
    public static void main(String[] args) {
        Font font = new Font("Serif", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        LineMetrics lm = font.getStringMetrics("Hello", frc);
        float descent = lm.getDescent();
        System.out.println("Descent: " + descent);
    }
}
