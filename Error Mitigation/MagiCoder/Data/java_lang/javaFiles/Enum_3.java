import java.lang.Enum;

public class Enum_3 {
    public static void main(String[] args) {
        // Define an enum
        enum Color {
            RED, GREEN, BLUE;
        }

        // Get the ordinal of an enum constant
        int ordinal = Color.RED.ordinal();
        System.out.println("The ordinal of RED is: " + ordinal);
    }
}
