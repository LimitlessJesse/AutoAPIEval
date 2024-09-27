import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_3 {
    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Hashtable<>();
        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");

        System.out.println("Before removal: " + dictionary);

        String removedValue = dictionary.remove("key1");

        System.out.println("Removed value: " + removedValue);
        System.out.println("After removal: " + dictionary);
    }
}
