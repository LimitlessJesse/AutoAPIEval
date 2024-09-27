import java.util.IdentityHashMap;

public class IdentityHashMap_5 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Is the map empty? " + map.isEmpty());

        map.clear();

        System.out.println("Is the map empty after clearing? " + map.isEmpty());
    }
}
