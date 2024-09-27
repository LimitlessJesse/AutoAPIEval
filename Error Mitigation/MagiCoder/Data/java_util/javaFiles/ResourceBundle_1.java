import java.util.ResourceBundle;
import java.util.MissingResourceException;

public class ResourceBundle_1 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("MyBundle");
        try {
            Object obj = rb.getObject("key");
            System.out.println(obj);
        } catch (MissingResourceException e) {
            System.out.println("No object for the given key can be found");
        }
    }
}
