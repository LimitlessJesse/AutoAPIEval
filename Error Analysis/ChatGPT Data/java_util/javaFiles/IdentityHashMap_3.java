import java.util.IdentityHashMap;

public class IdentityHashMap_3 {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        int key = 1;
        
        boolean containsKey = map.containsKey(key);
        System.out.println("Contains key " + key + ": " + containsKey);
    }
}
