import java.util.IdentityHashMap;

public class IdentityHashMap_7 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String key = "Hello";
        map.put(key, 1);
        System.out.println(map);
        map.remove(key);
        System.out.println(map);
    }
}
