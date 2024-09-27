import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_2 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        FontMetrics fontMetrics = ge.createFontMetrics(font);

        String str = "Hello World";
        int width = fontMetrics.stringWidth(str);
        System.out.println("Width of the string '" + str + "': " + width);
    }
}
