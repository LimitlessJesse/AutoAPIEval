import java.awt.Font;

public class Font_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.BOLD, 12);
        boolean isBold = font.isBold();
        System.out.println("Is bold: " + isBold);
    }
}
