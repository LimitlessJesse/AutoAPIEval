import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_23 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        ConcurrentHashMap.KeySetView<String, String> keySetView = map.keySet();

        System.out.println("Before remove: " + keySetView);

        boolean isRemoved = keySetView.remove("key1");

        System.out.println("After remove: " + keySetView);
        System.out.println("Is key1 removed? " + isRemoved);
    }
}
