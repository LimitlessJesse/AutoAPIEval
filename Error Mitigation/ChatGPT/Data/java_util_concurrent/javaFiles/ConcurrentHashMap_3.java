import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        // Adding key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Removing a key from the map
        Integer removedValue = map.remove("Two");
        
        System.out.println("Removed value: " + removedValue);
        System.out.println("Map after removal: " + map);
    }
}
