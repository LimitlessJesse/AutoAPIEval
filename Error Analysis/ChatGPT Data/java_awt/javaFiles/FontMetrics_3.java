import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        Graphics graphics = GraphicsEnvironment.getLocalGraphicsEnvironment().createGraphics();
        FontMetrics fontMetrics = graphics.getFontMetrics(font);
        
        int ascent = fontMetrics.getAscent();
        System.out.println("Ascent: " + ascent);
    }
}
