import java.util.WeakHashMap;

public class WeakHashMap_2 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();
        weakMap.put("key1", "value1");
        System.out.println(weakMap);
    }
}
