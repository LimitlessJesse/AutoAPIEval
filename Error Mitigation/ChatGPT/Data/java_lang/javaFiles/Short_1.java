import java.lang.Short;

public class Short_1 {
    public static void main(String[] args) {
        String number = "123";
        try {
            short result = Short.parseShort(number);
            System.out.println("Parsed short value: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing short value: " + e.getMessage());
        }
    }
}
