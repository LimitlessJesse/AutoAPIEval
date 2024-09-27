import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class LineMetrics_6 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        String text = "Hello";
        TextLayout layout = new TextLayout(text, font, frc);
        Rectangle2D bounds = layout.getBounds();
        LineMetrics lm = layout.getLineMetrics(0);
        float strikethroughThickness = lm.getStrikethroughThickness();
        System.out.println("Strikethrough thickness: " + strikethroughThickness);
    }
}
