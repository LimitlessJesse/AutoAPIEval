import java.lang.Long;

public class Long_1 {
    public static void main(String[] args) {
        String s = "1234567890";
        try {
            long l = Long.parseLong(s);
            System.out.println("Parsed long: " + l);
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse long: " + e.getMessage());
        }
    }
}
