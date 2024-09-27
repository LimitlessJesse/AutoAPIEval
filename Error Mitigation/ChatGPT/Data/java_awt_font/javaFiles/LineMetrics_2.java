import java.awt.Font;
import java.awt.font.LineMetrics;

public class LineMetrics_2 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        LineMetrics metrics = font.getLineMetrics("Sample Text", null);

        float descent = metrics.getDescent();
        System.out.println("Descent: " + descent);
    }
}
