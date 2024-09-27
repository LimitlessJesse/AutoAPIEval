import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        ConcurrentHashMap.KeySetView<String, String> keySetView = map.keySet();

        System.out.println("Before clear: " + keySetView);

        keySetView.clear();

        System.out.println("After clear: " + keySetView);
    }
}
