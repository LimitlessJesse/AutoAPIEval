import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        Integer value = map.get("One");
        System.out.println(value);
    }
}
