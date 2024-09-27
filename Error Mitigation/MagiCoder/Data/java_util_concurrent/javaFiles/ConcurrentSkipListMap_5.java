import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_5 {
    public static void main(String[] args) {
        ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        boolean containsValue = map.containsValue("value2");
        System.out.println(containsValue); // Output: true
    }
}
