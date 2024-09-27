import java.util.WeakHashMap;

public class WeakHashMap_5 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();
        weakMap.put("1", "Hello");
        weakMap.put("2", "World");

        boolean containsValue = weakMap.containsValue("Hello");
        System.out.println(containsValue);  // Output: true

        containsValue = weakMap.containsValue("Java");
        System.out.println(containsValue);  // Output: false
    }
}
