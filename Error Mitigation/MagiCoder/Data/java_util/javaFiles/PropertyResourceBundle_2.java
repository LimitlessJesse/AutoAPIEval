import java.util.Enumeration;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PropertyResourceBundle_2 {
    public static void main(String[] args) {
        ResourceBundle rb = PropertyResourceBundle.getBundle("myBundle");
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + rb.getString(key));
        }
    }
}
