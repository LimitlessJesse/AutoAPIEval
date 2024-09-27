import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PropertyResourceBundle_4 {
    public static void main(String[] args) {
        PropertyResourceBundle bundle = (PropertyResourceBundle) ResourceBundle.getBundle("example");
        Object obj = bundle.handleGetObject("key");
        System.out.println(obj);
    }
}
