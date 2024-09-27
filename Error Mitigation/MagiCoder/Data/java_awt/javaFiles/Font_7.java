import java.awt.Font;

public class Font_7 {
    public static void main(String[] args) {
        Font originalFont = new Font("Arial", Font.PLAIN, 12);
        Font boldFont = originalFont.deriveFont(Font.BOLD);
        System.out.println("Original font: " + originalFont);
        System.out.println("Bold font: " + boldFont);
    }
}
