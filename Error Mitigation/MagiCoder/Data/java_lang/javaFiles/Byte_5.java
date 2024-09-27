import java.lang.Byte;

public class Byte_5 {
    public static void main(String[] args) {
        try {
            byte b = Byte.parseByte("123", 10);
            System.out.println(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
