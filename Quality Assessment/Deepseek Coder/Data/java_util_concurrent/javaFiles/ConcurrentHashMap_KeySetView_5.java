import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        ConcurrentHashMap.KeySetView<String, String> keySetView = map.keySet();
        int size = keySetView.size();

        System.out.println("Size of the ConcurrentHashMap.KeySetView: " + size);
    }
}
