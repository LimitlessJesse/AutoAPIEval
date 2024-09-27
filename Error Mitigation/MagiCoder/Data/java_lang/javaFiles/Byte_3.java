import java.lang.Byte;

public class Byte_3 {
    public static void main(String[] args) {
        try {
            Byte b = Byte.decode("123");
            System.out.println(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
