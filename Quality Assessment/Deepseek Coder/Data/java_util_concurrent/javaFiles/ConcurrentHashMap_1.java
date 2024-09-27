import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");

        // If the key "key2" does not exist, put "value2" to it.
        map.putIfAbsent("key2", "value2");

        // If the key "key2" already exists, do not change its value.
        map.putIfAbsent("key2", "newValue");

        System.out.println(map);
    }
}
