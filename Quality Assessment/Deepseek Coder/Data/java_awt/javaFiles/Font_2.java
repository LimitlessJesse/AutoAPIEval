import java.awt.Font;

public class Font_2 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 16);
        String text = "Hello, World!";
        int size = font.getStringBounds(text, null).getWidth();
        System.out.println("The size of the text in pixels: " + size);
    }
}
