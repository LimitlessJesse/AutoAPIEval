import java.util.ResourceBundle;
import java.util.Enumeration;

public class ResourceBundle_4 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        Enumeration<String> keys = bundle.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = bundle.getString(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
