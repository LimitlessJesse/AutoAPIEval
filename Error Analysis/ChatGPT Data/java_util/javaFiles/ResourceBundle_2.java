import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_2 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources", locale);
        String greeting = bundle.getString("greeting");
        System.out.println(greeting);
    }
}
