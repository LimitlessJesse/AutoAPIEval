import java.util.ResourceBundle;

public class ResourceBundle_4 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("example");
        String value = bundle.getString("key");
        System.out.println("Value for key 'key': " + value);
    }
}
