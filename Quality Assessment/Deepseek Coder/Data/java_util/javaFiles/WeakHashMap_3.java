import java.util.WeakHashMap;

public class WeakHashMap_3 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("key1", "value1");
        weakHashMap.put("key2", "value2");
        weakHashMap.put("key3", "value3");

        System.out.println("Initial WeakHashMap: " + weakHashMap);

        // Remove an entry
        weakHashMap.remove("key2");

        System.out.println("WeakHashMap after removal: " + weakHashMap);
    }
}
