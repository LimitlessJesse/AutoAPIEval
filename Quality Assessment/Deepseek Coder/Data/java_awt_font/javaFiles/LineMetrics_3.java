import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

public class LineMetrics_3 {
    public static void main(String[] args) {
        Font font = new Font("Serif", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        String text = "Hello, World!";
        LineMetrics lm = font.getStringMetrics(text, frc);
        float leading = lm.getLeading();
        System.out.println("Leading: " + leading);
    }
}
