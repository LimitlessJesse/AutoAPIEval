import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key", "oldValue");
        boolean result = map.replace("key", "oldValue", "newValue");
        System.out.println(result); // prints: true
        System.out.println(map.get("key")); // prints: newValue
    }
}
