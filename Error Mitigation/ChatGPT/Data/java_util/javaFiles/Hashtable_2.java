import java.util.Hashtable;

public class Hashtable_2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        
        boolean result = hashtable.contains("One");
        System.out.println(result); // Output: true
    }
}
