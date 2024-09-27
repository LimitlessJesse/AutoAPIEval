import java.util.WeakHashMap;

public class WeakHashMap_4 {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("Before removal: " + map);

        // Removing key 2
        map.remove(2);

        System.out.println("After removal: " + map);
    }
}
