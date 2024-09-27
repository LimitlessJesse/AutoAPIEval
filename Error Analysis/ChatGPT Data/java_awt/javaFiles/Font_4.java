import java.awt.Font;

public class Font_4 {
    public static void main(String[] args) {
        Font font = new Font("Times New Roman", Font.PLAIN, 12);
        int hashcode = font.hashCode();
        System.out.println("Hashcode of the font: " + hashcode);
    }
}
