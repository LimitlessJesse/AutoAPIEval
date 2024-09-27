import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_4 {
    public static void main(String[] args) {
        ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // Check if the map contains a key
        boolean containsKey = map.containsKey("key1");
        System.out.println("Does the map contain the key 'key1'? " + containsKey);
    }
}
