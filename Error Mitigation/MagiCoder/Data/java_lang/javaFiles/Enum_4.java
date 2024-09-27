import java.lang.Enum;

public class Enum_4 {
    public static void main(String[] args) {
        // Define an enum
        enum Color {
            RED, GREEN, BLUE;
        }

        // Get the enum constants
        Color[] colors = Color.values();

        // Print the toString() of each enum constant
        for (Color color : colors) {
            System.out.println(color.toString());
        }
    }
}
