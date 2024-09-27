import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_5 {
    public static void main(String[] args) {
        // Get the GraphicsEnvironment instance
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // Get all available fonts
        Font[] availableFonts = ge.getAllFonts();
        // Choose a font
        Font font = new Font("Arial", Font.PLAIN, 12);
        // Create a Graphics object
        Graphics g = getGraphics();
        // Get the FontMetrics for the chosen font
        FontMetrics fm = g.getFontMetrics(font);
        // Get the width of a character
        int width = fm.charWidth('A');
        System.out.println("The width of the character 'A' is: " + width);
    }
}
