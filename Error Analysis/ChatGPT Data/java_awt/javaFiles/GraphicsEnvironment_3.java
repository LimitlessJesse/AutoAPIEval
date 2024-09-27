import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class GraphicsEnvironment_3 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] allFonts = ge.getAllFonts();
        
        System.out.println("List of all available fonts:");
        for (Font font : allFonts) {
            System.out.println(font.getFontName());
        }
    }
}
