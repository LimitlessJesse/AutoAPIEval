import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class Font_1 {
    public static void main(String[] args) {
        Font font = new Font("Helvetica", Font.PLAIN, 12);
        String familyName = font.getFamily();
        System.out.println("Family Name: " + familyName);
        
        String[] availableFontFamilies = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        System.out.println("Available Font Families:");
        for (String fontFamily : availableFontFamilies) {
            System.out.println(fontFamily);
        }
    }
}
