import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;

public class Toolkit_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontMetrics fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(font);
        System.out.println("Ascent: " + fontMetrics.getAscent());
        System.out.println("Descent: " + fontMetrics.getDescent());
        System.out.println("Leading: " + fontMetrics.getLeading());
        System.out.println("Height: " + fontMetrics.getHeight());
    }
}
