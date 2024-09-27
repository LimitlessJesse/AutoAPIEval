import java.util.ResourceBundle;

public class ResourceBundle_4 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources");
        Object obj = bundle.getObject("key");
        System.out.println(obj);
    }
}
