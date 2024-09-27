import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;

public class LineMetrics_1 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        LineMetrics lineMetrics = font.getLineMetrics("Hello World", frc);
        
        int numChars = lineMetrics.getNumChars();
        System.out.println("Number of characters: " + numChars);
    }
}
