import java.util.EnumMap;

public class EnumMap_4 {
    public static void main(String[] args) {
        // Define an enum
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMap
        EnumMap<Color, String> enumMap = new EnumMap<>(Color.class);

        // Put some values into the EnumMap
        enumMap.put(Color.RED, "Red color");
        enumMap.put(Color.GREEN, "Green color");
        enumMap.put(Color.BLUE, "Blue color");

        // Get a value from the EnumMap
        String value = enumMap.get(Color.RED);
        System.out.println(value);  // Output: Red color
    }
}
