import java.lang.Integer;

public class Integer_7 {
    public static void main(String[] args) {
        try {
            int result = Integer.parseInt("42", 10);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
