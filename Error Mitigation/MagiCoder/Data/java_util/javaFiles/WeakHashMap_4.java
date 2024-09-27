import java.util.WeakHashMap;

public class WeakHashMap_4 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("Map before clear: " + map);

        map.clear();
        System.out.println("Map after clear: " + map);
    }
}
