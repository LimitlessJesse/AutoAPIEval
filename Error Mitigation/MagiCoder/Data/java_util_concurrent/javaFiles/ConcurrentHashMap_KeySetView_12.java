import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_12 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        ConcurrentHashMap.KeySetView<String, String> keySetView = map.keySet();
        int size = keySetView.size();

        System.out.println("Size of the key set view: " + size);
    }
}
