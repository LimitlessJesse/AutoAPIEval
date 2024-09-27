import java.awt.Font;

public class Font_9 {
    public static void main(String[] args) {
        Font originalFont = new Font("Arial", Font.PLAIN, 12);
        Font derivedFont = originalFont.deriveFont(Font.BOLD, 14);
        System.out.println(derivedFont);
    }
}
