import java.util.IdentityHashMap;

public class IdentityHashMap_4 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        String key1 = new String("Key1");
        String key2 = new String("Key2");
        map.put(key1, "Value1");
        map.put(key2, "Value2");

        System.out.println("Initial map: " + map);

        map.remove(key1);

        System.out.println("Map after removing key1: " + map);
    }
}
