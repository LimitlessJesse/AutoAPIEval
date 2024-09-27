import java.util.ResourceBundle;

public class ResourceBundle_5 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        String str = bundle.getString("greeting");
        System.out.println(str);
    }
}
