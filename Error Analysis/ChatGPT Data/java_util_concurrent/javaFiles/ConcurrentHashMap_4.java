import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Map before removal: " + map);

        map.remove("key1");

        System.out.println("Map after removal: " + map);
    }
}
