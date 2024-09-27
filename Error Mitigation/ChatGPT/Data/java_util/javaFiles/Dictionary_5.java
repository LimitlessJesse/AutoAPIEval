import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionary_5 {
    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Hashtable<>();
        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");
        
        Enumeration<String> keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key);
        }
    }
}
