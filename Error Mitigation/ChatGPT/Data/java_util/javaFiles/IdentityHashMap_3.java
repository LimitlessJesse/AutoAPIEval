import java.util.IdentityHashMap;

public class IdentityHashMap_3 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        boolean containsKey = map.containsKey("key1");
        System.out.println("Contains key 'key1': " + containsKey);
    }
}
