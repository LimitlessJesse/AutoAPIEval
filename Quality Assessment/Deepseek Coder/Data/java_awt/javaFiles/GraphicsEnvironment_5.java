import java.awt.GraphicsEnvironment;
import java.awt.Font;

public class GraphicsEnvironment_5 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();

        for (Font font : fonts) {
            System.out.println(font.getFontName());
        }
    }
}
