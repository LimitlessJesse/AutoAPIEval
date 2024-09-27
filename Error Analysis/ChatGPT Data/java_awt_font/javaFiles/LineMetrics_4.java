import java.awt.Font;
import java.awt.font.LineMetrics;

public class LineMetrics_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        LineMetrics metrics = font.getLineMetrics("Sample text", null);
        float height = metrics.getHeight();
        System.out.println("Height of the text: " + height);
    }
}
