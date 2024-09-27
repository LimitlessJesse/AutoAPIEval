import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Value for key 'Three': " + map.get("Three"));
    }
}
