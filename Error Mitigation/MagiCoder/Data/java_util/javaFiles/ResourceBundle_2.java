import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundle_2 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("MyBundle");
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + rb.getString(key));
        }
    }
}
