import java.util.Enumeration;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PropertyResourceBundle_2 {
    public static void main(String[] args) {
        PropertyResourceBundle bundle = (PropertyResourceBundle) ResourceBundle.getBundle("example");
        Enumeration<String> keys = bundle.getKeys();
        
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = bundle.getString(key);
            System.out.println(key + " = " + value);
        }
    }
}
