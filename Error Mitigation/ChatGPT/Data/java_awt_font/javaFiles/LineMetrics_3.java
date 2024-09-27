import java.awt.Font;
import java.awt.font.LineMetrics;

public class LineMetrics_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        LineMetrics lineMetrics = font.getLineMetrics("Sample Text", null);
        float height = lineMetrics.getHeight();
        System.out.println("Height of the text: " + height);
    }
}
