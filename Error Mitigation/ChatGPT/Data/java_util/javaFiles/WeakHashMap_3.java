import java.util.WeakHashMap;

public class WeakHashMap_3 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        boolean containsValue = map.containsValue(2);
        System.out.println("Contains value 2: " + containsValue);
    }
}
