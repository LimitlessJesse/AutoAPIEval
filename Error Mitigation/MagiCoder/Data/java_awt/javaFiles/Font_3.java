import java.awt.Font;

public class Font_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        String fontName = font.getName();
        System.out.println("The name of the font is: " + fontName);
    }
}
