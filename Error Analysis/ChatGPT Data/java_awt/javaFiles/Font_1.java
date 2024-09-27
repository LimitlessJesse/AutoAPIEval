import java.awt.Font;

public class Font_1 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        String family = font.getFamily();
        System.out.println("Font Family: " + family);
    }
}
