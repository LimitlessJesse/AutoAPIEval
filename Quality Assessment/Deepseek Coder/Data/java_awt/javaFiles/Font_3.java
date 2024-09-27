import java.awt.Font;

public class Font_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.BOLD, 12);
        int style = font.getStyle();
        boolean isBold = (style & Font.BOLD)!= 0;
        System.out.println("Is the font bold? " + isBold);
    }
}
