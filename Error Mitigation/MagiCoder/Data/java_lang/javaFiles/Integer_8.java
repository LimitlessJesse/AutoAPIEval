import java.lang.Integer;

public class Integer_8 {
    public static void main(String[] args) {
        try {
            int result = Integer.parseUnsignedInt("123");
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
