import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        ConcurrentHashMap.KeySetView<String, String> keySet = map.keySet();

        System.out.println(keySet.contains("key1"));  // Output: true
        System.out.println(keySet.contains("key3"));  // Output: false
    }
}
