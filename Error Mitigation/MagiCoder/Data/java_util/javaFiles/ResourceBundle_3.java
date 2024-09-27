import java.util.ResourceBundle;
import java.util.Locale;

public class ResourceBundle_3 {
    public static void main(String[] args) {
        // Create a ResourceBundle for the default locale
        ResourceBundle rb = ResourceBundle.getBundle("MyBundle");

        // Get a string for the given key
        String str = rb.getString("key");

        System.out.println(str);
    }
}
