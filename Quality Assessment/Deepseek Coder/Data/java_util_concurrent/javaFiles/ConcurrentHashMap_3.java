import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("Initial map: " + map);

        boolean isRemoved = map.remove("key2", "value2");
        System.out.println("Is 'key2' removed? " + isRemoved);

        System.out.println("Map after removal: " + map);
    }
}
