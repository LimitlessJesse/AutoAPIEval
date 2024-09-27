import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Associates the specified value with the specified key in this map
        map.put("One", 1);
        map.put("Two", 2);
        
        // Replaces the old value if the key already exists
        map.put("One", 10);
        
        // Prints the previous value associated with key
        System.out.println(map.put("One", 100)); // Output: 10
        System.out.println(map.put("Three", 3)); // Output: null
    }
}
