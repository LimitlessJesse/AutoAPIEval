import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_21 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        ConcurrentHashMap.KeySetView<String, String> keySetView = map.keySet();

        System.out.println("Is the keySetView empty? " + keySetView.isEmpty());

        map.clear();

        System.out.println("Is the keySetView empty after clearing the map? " + keySetView.isEmpty());
    }
}
