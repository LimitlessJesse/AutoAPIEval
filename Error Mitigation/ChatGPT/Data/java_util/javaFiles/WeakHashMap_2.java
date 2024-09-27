import java.util.WeakHashMap;

public class WeakHashMap_2 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        
        System.out.println("Contains key 'key1': " + map.containsKey("key1"));
        System.out.println("Contains key 'key3': " + map.containsKey("key3"));
    }
}
