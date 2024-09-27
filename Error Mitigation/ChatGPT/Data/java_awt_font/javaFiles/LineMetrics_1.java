import java.awt.Font;
import java.awt.font.LineMetrics;

public class LineMetrics_1 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        LineMetrics metrics = font.getLineMetrics("Sample Text", null);

        float ascent = metrics.getAscent();
        System.out.println("Ascent: " + ascent);
    }
}
