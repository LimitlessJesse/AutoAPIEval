import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_1 {
    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Hashtable<>();
        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");

        String value1 = dictionary.get("key1");
        String value3 = dictionary.get("key3");

        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key3: " + value3);
    }
}
