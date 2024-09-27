import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        // Adding key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Retrieving values using the get method
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Four': " + map.get("Four")); // This will return null
    }
}
