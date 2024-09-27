import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;

public class Toolkit_5 {
    public static void main(String[] args) {
        // Creating a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Getting the FontMetrics object for the specified font
        FontMetrics fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(font);
        
        // Displaying the font metrics
        int ascent = fontMetrics.getAscent();
        int descent = fontMetrics.getDescent();
        int height = fontMetrics.getHeight();
        
        System.out.println("Ascent: " + ascent);
        System.out.println("Descent: " + descent);
        System.out.println("Height: " + height);
    }
}
