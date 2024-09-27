import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_2 {
    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Hashtable<>();
        
        // Adding key-value pairs to the dictionary
        String previousValue1 = dictionary.put("key1", "value1");
        String previousValue2 = dictionary.put("key2", "value2");
        
        System.out.println("Previous value for key1: " + previousValue1);
        System.out.println("Previous value for key2: " + previousValue2);
    }
}
