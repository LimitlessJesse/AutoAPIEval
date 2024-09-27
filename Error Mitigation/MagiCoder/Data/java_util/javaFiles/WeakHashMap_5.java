import java.util.WeakHashMap;

public class WeakHashMap_5 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.containsKey("One")); // Outputs: true
        System.out.println(map.containsKey("Four")); // Outputs: false
    }
}
