import java.util.Hashtable;

public class Hashtable_3 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");

        System.out.println("Hashtable before removal: " + hashtable);

        // Removing the mapping for key 1
        String removedValue = hashtable.remove(1);

        System.out.println("Removed value: " + removedValue);
        System.out.println("Hashtable after removal: " + hashtable);
    }
}
