import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // Get the value for key1
        String value1 = map.get("key1");
        System.out.println("Value for key1: " + value1);

        // Get the value for key2
        String value2 = map.get("key2");
        System.out.println("Value for key2: " + value2);

        // Try to get a value for a non-existent key
        String value3 = map.get("key3");
        System.out.println("Value for key3: " + value3);
    }
}
