import java.util.Hashtable;

public class Hashtable_2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        
        // Using put() method to add key-value pairs to the hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        
        System.out.println(hashtable);
    }
}
