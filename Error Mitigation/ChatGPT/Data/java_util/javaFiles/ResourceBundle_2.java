import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundle_2 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources");
        Enumeration<String> keys = bundle.getKeys();
        
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = bundle.getString(key);
            System.out.println(key + ": " + value);
        }
    }
}
