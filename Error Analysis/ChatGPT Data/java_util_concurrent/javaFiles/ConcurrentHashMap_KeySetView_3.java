import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "One");
        map.put("2", "Two");

        // Creating a key set view of the ConcurrentHashMap
        ConcurrentHashMap.KeySetView<String, String> keySetView = map.keySet();

        // Removing all elements that are present in the given collection
        keySetView.removeAll(map.keySet());

        // Output the key set after removing elements
        System.out.println(keySetView);
    }
}
