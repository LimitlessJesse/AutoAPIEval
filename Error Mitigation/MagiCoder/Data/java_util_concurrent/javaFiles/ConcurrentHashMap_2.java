import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        System.out.println(map.get("key1"));
    }
}
