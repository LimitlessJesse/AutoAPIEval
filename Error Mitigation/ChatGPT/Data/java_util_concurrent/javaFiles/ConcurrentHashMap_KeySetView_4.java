import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        ConcurrentHashMap.KeySetView<String, Integer> keySetView = map.keySet();
        System.out.println("Before clear: " + keySetView);
        
        keySetView.clear();
        System.out.println("After clear: " + keySetView);
    }
}
