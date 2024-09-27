import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_28 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        ConcurrentHashMap.KeySetView<String, Integer> keySetView = map.keySet();

        String[] keys = keySetView.toArray(new String[0]);

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
