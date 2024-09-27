import java.util.Hashtable;

public class Hashtable_5 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        
        System.out.println("Hashtable before clear: " + hashtable);
        
        hashtable.clear();
        
        System.out.println("Hashtable after clear: " + hashtable);
    }
}
