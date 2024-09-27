import java.util.WeakHashMap;

public class WeakHashMap_1 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();
        weakMap.put("1", "Hello");
        weakMap.put("2", "World");

        String value = weakMap.get("1");
        System.out.println(value);  // Output: Hello
    }
}
