import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_3 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        
        // Add key value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        
        // Remove a key from the map
        String removedValue = map.remove(1);
        
        // Output the removed value
        System.out.println("Removed value: " + removedValue);
        
        // Output the updated map
        System.out.println("Updated map: " + map);
    }
}
