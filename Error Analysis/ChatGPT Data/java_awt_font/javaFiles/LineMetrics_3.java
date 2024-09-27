import java.awt.Font;
import java.awt.font.LineMetrics;
import java.awt.GraphicsEnvironment;

public class LineMetrics_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        LineMetrics lineMetrics = font.getLineMetrics("Sample Text", null);
        float leading = lineMetrics.getLeading();
        System.out.println("Leading: " + leading);
    }
}
