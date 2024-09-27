import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

public class LineMetrics_5 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 16);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        LineMetrics lm = font.getStringMetrics("Hello", frc);
        float strikethroughThickness = lm.getStrikethroughThickness();
        System.out.println("Strikethrough Thickness: " + strikethroughThickness);
    }
}
