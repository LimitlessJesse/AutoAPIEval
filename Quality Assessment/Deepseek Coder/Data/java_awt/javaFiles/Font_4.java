import java.awt.Font;

public class Font_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.ITALIC, 12);
        boolean isItalic = font.isItalic();
        System.out.println("Is the font italic? " + isItalic);
    }
}
