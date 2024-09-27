import java.util.WeakHashMap;

public class WeakHashMap_1 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("key1", "value1");
        weakHashMap.put("key2", "value2");

        System.out.println(weakHashMap.get("key1")); // Output: value1
        System.out.println(weakHashMap.get("key3")); // Output: null
    }
}
