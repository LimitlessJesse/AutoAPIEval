import java.util.Hashtable;

public class Hashtable_4 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "Hello");
        hashtable.put("2", "World");

        boolean key1Exists = hashtable.containsKey("1");
        boolean key3Exists = hashtable.containsKey("3");

        System.out.println("Key '1' exists: " + key1Exists);
        System.out.println("Key '3' exists: " + key3Exists);
    }
}
