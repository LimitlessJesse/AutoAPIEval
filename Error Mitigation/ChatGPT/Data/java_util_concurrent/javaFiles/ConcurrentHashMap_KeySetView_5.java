import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        
        ConcurrentHashMap.KeySetView<String, Integer> keySetView = map.keySet();
        Spliterator<String> spliterator = keySetView.spliterator();
        
        spliterator.forEachRemaining(System.out::println);
    }
}
