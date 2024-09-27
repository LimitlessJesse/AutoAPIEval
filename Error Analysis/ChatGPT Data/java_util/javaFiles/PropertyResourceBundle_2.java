import java.util.Enumeration;
import java.util.PropertyResourceBundle;

public class PropertyResourceBundle_2 {
    public static void main(String[] args) {
        String fileName = "example.properties";
        PropertyResourceBundle bundle = (PropertyResourceBundle) PropertyResourceBundle.getBundle(fileName);
        Enumeration<String> keys = bundle.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = bundle.getString(key);
            System.out.println(key + " = " + value);
        }
    }
}
