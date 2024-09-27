import java.util.IdentityHashMap;

public class IdentityHashMap_4 {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        map.put(1, "One");
        
        boolean containsValue = map.containsValue("One");
        System.out.println("Contains value 'One': " + containsValue);
    }
}
