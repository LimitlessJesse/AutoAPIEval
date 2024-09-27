import java.awt.FontMetrics;
import java.awt.Font;

public class FontMetrics_1 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontMetrics fontMetrics = new FontMetrics(font) {
            @Override
            public int charWidth(char ch) {
                // Implementation of charWidth method
                return 0;
            }
        };
        
        char character = 'A';
        int width = fontMetrics.charWidth(character);
        System.out.println("Width of character '" + character + "': " + width);
    }
}
