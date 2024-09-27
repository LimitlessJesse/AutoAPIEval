import java.util.WeakHashMap;

public class WeakHashMap_1 {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println("Map before clear: " + map);
        
        map.clear();
        
        System.out.println("Map after clear: " + map);
    }
}
