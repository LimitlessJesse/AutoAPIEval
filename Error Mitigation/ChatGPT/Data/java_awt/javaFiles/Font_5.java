import java.awt.Font;

public class Font_5 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        boolean italic = font.isItalic();
        System.out.println("Is italic: " + italic);
    }
}
