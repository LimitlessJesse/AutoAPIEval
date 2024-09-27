import java.util.IdentityHashMap;

public class IdentityHashMap_4 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        String key = "Hello";
        String value = "World";
        map.put(key, value);
        System.out.println(map.get(key));
    }
}
