import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        // Adding key-value pairs to the ConcurrentHashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Retrieving values using keys
        System.out.println("Value for key 'Two': " + map.get("Two"));
    }
}
