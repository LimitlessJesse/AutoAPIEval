import java.util.WeakHashMap;

public class WeakHashMap_5 {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        
        System.out.println("Size of WeakHashMap: " + map.size());
    }
}
