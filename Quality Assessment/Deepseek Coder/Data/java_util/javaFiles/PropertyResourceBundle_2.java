import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Enumeration;

public class PropertyResourceBundle_2 {
    public static void main(String[] args) {
        ResourceBundle bundle = PropertyResourceBundle.getBundle("mybundle");
        Enumeration<String> keys = bundle.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = bundle.getString(key);
            System.out.println(key + ": " + value);
        }
    }
}
