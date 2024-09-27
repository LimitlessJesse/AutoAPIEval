import java.lang.Byte;

public class Byte_4 {
    public static void main(String[] args) {
        try {
            byte b = Byte.parseByte("123");
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
