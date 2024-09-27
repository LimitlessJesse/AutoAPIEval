import java.util.EnumMap;

public class EnumMap_2 {
    public static void main(String[] args) {
        // Create an EnumMap
        EnumMap<MyEnum, String> enumMap = new EnumMap<>(MyEnum.class);

        // Add some values
        enumMap.put(MyEnum.ONE, "One");
        enumMap.put(MyEnum.TWO, "Two");
        enumMap.put(MyEnum.THREE, "Three");

        // Check if the EnumMap contains a specific value
        boolean containsValue = enumMap.containsValue("Two");

        // Print the result
        System.out.println("Does the EnumMap contain the value 'Two'? " + containsValue);
    }
}

// Define an Enum
enum MyEnum {
    ONE, TWO, THREE
}
