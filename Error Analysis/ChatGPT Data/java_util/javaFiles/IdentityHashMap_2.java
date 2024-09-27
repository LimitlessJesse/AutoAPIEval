import java.util.IdentityHashMap;

public class IdentityHashMap_2 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        
        Integer value = map.get("one");
        System.out.println("Value for key 'one': " + value);
    }
}
