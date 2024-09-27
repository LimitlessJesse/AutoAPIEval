import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundle_2 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        Set<String> keys = bundle.keySet();

        for (String key : keys) {
            System.out.println(key + ": " + bundle.getString(key));
        }
    }
}
