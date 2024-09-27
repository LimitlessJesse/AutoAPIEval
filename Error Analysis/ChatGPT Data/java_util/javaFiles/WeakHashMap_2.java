import java.util.WeakHashMap;

public class WeakHashMap_2 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Value for key 'Three': " + map.get("Three"));
    }
}
