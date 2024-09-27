import java.util.Hashtable;

public class Hashtable_3 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Put elements to the hashtable
        hashtable.put("Key1", "Value1");
        hashtable.put("Key2", "Value2");
        hashtable.put("Key3", "Value3");

        System.out.println("Hashtable before removal: " + hashtable);

        // Remove an element from the hashtable
        hashtable.remove("Key2");

        System.out.println("Hashtable after removal: " + hashtable);
    }
}
