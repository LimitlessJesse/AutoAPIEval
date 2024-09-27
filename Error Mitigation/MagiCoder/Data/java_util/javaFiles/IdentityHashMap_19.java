import java.util.IdentityHashMap;

public class IdentityHashMap_19 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String key = "Hello";
        map.put(key, 1);
        System.out.println(map.containsKey(key)); // Output: true
        System.out.println(map.containsKey("World")); // Output: false
    }
}
