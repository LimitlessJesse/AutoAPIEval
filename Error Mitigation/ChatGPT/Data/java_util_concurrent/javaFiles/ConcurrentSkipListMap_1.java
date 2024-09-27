import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_1 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        
        // Using putIfAbsent method
        String previousValue = map.putIfAbsent(1, "One");
        System.out.println("Previous value: " + previousValue);
        
        // Adding a new key-value pair
        previousValue = map.putIfAbsent(2, "Two");
        System.out.println("Previous value: " + previousValue);
        
        // Trying to add a key that already exists
        previousValue = map.putIfAbsent(1, "New One");
        System.out.println("Previous value: " + previousValue);
        
        System.out.println("Map: " + map);
    }
}
