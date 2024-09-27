import java.util.IdentityHashMap;

public class IdentityHashMap_1 {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        
        // Associates the specified value with the specified key
        map.put(1, "One");
        map.put(2, "Two");
        
        // Replaces the old value if the key already exists
        map.put(1, "New One");
        
        // Prints the previous value associated with key
        System.out.println(map.put(1, "New One")); // Output: One
    }
}
