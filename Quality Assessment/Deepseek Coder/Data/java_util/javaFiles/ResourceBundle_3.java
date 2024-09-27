import java.util.ResourceBundle;

public class ResourceBundle_3 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        String key = "key1";
        Object obj = bundle.handleGetObject(key);
        if (obj!= null) {
            System.out.println(obj.toString());
        } else {
            System.out.println("No object found for key: " + key);
        }
    }
}
