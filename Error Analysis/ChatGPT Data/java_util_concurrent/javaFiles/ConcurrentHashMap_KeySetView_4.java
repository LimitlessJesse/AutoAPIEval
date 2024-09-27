import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        ConcurrentHashMap.KeySetView<String, Integer> keySetView = map.keySet();
        ConcurrentHashMap.KeySetView<String, Integer> otherKeySetView = map.keySet();

        // Retain only the elements in the key set view that are also in the other key set view
        boolean result = keySetView.retainAll(otherKeySetView);

        System.out.println("Key set view after retainAll operation: " + keySetView);
        System.out.println("Result of the retainAll operation: " + result);
    }
}
