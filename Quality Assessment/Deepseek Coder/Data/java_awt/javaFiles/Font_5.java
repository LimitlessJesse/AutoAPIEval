import java.awt.Font;

public class Font_5 {
    public static void main(String[] args) {
        Font originalFont = new Font("Arial", Font.PLAIN, 12);
        System.out.println("Original Font: " + originalFont);

        float newSize = 16.0f;
        Font newFont = originalFont.deriveFont(newSize);
        System.out.println("New Font: " + newFont);
    }
}
