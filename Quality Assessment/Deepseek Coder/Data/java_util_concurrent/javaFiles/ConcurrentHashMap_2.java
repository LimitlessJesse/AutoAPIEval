import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("Before replace: " + map);

        map.replace("key2", "newValue");

        System.out.println("After replace: " + map);
    }
}
