import java.awt.Font;

public class Font_8 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        Font newFont = font.deriveFont(24.0f);
        System.out.println(newFont);
    }
}
