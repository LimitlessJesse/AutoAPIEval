import java.awt.font.LineMetrics;
import java.awt.Font;
import java.awt.Graphics;

public class LineMetrics_5 {
    public static void main(String[] args) {
        // Create a font object
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Create a LineMetrics object
        Graphics g = null; // get graphics object from your application
        LineMetrics metrics = font.getLineMetrics("Text", g.getFontRenderContext());
        
        // Get the strikethrough offset
        float strikethroughOffset = metrics.getStrikethroughOffset();
        
        System.out.println("Strikethrough offset: " + strikethroughOffset);
    }
}
