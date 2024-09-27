import java.util.IdentityHashMap;

public class IdentityHashMap_2 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        Integer value = map.get("key1");
        System.out.println("Value for key1: " + value);

        value = map.get("key3");
        System.out.println("Value for key3: " + value);
    }
}
