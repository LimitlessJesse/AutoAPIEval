import java.awt.Font;

public class Font_2 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        int size = font.getSize();
        System.out.println("Font Size: " + size);
    }
}
