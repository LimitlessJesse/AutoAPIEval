import java.util.IdentityHashMap;

public class IdentityHashMap_9 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("Before clear: " + map);
        map.clear();
        System.out.println("After clear: " + map);
    }
}
