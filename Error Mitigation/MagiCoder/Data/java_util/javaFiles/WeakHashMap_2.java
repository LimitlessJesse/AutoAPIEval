import java.util.WeakHashMap;

public class WeakHashMap_2 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("key1", "value1");
        weakHashMap.put("key2", "value2");
        System.out.println(weakHashMap);
    }
}
