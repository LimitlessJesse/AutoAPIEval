import java.lang.Long;

public class Long_2 {
    public static void main(String[] args) {
        try {
            long result = Long.parseLong("1234567890", 10);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
