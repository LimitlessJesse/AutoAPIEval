import java.util.IdentityHashMap;

public class IdentityHashMap_10 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map1 = new IdentityHashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");

        IdentityHashMap<String, String> map2 = new IdentityHashMap<>();
        map2.put("key1", "value1");
        map2.put("key2", "value2");

        System.out.println(map1.equals(map2)); // Output: false
    }
}
