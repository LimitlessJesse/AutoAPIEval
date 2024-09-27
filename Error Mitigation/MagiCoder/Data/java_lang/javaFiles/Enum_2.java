import java.lang.Enum;

public class Enum_2 {
    public static void main(String[] args) {
        // Define an enum
        enum Color {
            RED, GREEN, BLUE;
        }

        // Get the enum constants
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        Color color3 = Color.BLUE;

        // Compare the enum constants
        System.out.println(color1.equals(color2));  // Output: false
        System.out.println(color1.equals(color3));  // Output: false
        System.out.println(color2.equals(color3));  // Output: false
    }
}
