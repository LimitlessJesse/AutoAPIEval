import java.util.Set;
import java.util.Map;
import java.util.jar.Attributes;

public class Attributes_4 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        
        // Add some entries to the Attributes
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        
        // Get the entry set
        Set<Map.Entry<Object, Object>> entrySet = attributes.entrySet();
        
        // Display the entries
        for (Map.Entry<Object, Object> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
