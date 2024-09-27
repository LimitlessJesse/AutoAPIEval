import java.util.IdentityHashMap;

public class IdentityHashMap_5 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
