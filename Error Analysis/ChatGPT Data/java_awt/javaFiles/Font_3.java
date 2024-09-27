import java.awt.Font;

public class Font_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        int style = font.getStyle();
        System.out.println("Font Style: " + style);
    }
}
