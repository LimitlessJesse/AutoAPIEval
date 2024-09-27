import java.util.IdentityHashMap;

public class IdentityHashMap_8 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Size of the map: " + map.size());
    }
}
