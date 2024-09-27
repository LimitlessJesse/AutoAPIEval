import java.util.EnumMap;

public class EnumMap_1 {
    public static void main(String[] args) {
        // Define an enum
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMap
        EnumMap<Color, String> enumMap = new EnumMap<>(Color.class);

        // Add some elements to the EnumMap
        enumMap.put(Color.RED, "Red color");
        enumMap.put(Color.GREEN, "Green color");
        enumMap.put(Color.BLUE, "Blue color");

        // Check if the EnumMap contains a key
        boolean containsKey = enumMap.containsKey(Color.RED);
        System.out.println("Does the EnumMap contain the key RED? " + containsKey);
    }
}
