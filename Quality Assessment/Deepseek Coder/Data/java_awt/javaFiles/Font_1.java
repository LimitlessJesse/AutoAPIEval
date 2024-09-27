import java.awt.Font;

public class Font_1 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 14);
        String fontName = font.getFontName();
        System.out.println("Font Name: " + fontName);
    }
}
