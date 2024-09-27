import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_4 {
    public static void main(String[] args) {
        // Create a SimpleImmutableEntry
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("Key", 10);
        
        // Call toString() method
        String entryString = entry.toString();
        
        // Print the result
        System.out.println("SimpleImmutableEntry toString: " + entryString);
    }
}
