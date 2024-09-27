import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class GraphicsEnvironment_3 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();
        
        for (Font font : fonts) {
            System.out.println(font.getFontName());
        }
    }
}
