import java.util.ResourceBundle;

public class ResourceBundle_5 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("myBundle");
        boolean containsKey = bundle.containsKey("key");
        System.out.println(containsKey);
    }
}
