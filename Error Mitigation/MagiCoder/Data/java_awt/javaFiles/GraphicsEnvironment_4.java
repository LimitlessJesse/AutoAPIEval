import java.awt.GraphicsEnvironment;
import java.awt.Font;

public class GraphicsEnvironment_4 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] allFonts = ge.getAllFonts();

        for (Font font : allFonts) {
            System.out.println(font.getFontName());
        }
    }
}
