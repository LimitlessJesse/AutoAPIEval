import java.util.ResourceBundle;

public class ResourceBundle_1 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources");
        String greeting = bundle.getString("greeting");
        System.out.println(greeting);
    }
}
