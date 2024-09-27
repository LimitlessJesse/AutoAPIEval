import java.util.WeakHashMap;

public class WeakHashMap_3 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("key1", "value1");
        weakHashMap.put("key2", "value2");
        System.out.println(weakHashMap);

        // remove the mapping for key1
        weakHashMap.remove("key1");
        System.out.println(weakHashMap);
    }
}
