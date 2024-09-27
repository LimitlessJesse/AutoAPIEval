import java.util.WeakHashMap;

public class WeakHashMap_3 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put("One", 1);
        boolean containsKey = map.containsKey("One");
        System.out.println("Key 'One' exists in map: " + containsKey);
    }
}
