import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Font;

public class FontMetrics_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        Graphics graphics = null; // You need to provide a Graphics object here
        FontMetrics fontMetrics = graphics.getFontMetrics(font);
        String str = "Hello, World!";
        int width = fontMetrics.stringWidth(str);
        System.out.println("The width of the string is: " + width);
    }
}
