import java.awt.Font;

public class Font_6 {
    public static void main(String[] args) {
        // Create a new font
        Font font = new Font("Serif", Font.PLAIN, 12);
        
        // Derive a new font with a different size
        Font derivedFont = font.deriveFont(Font.PLAIN, 16);
        
        // Print the original font
        System.out.println("Original font: " + font);
        
        // Print the derived font
        System.out.println("Derived font: " + derivedFont);
    }
}
