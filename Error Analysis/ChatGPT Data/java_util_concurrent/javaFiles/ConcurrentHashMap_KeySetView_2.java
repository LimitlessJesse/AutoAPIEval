import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        ConcurrentHashMap.KeySetView<String, Integer> keySetView = map.keySet();
        boolean removed = keySetView.remove("One");
        
        System.out.println("KeySetView after removal: " + keySetView);
        System.out.println("Was 'One' removed? " + removed);
    }
}
