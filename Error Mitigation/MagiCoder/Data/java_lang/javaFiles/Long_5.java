import java.lang.Long;

public class Long_5 {
    public static void main(String[] args) {
        try {
            Long num = Long.decode("1234567890");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
