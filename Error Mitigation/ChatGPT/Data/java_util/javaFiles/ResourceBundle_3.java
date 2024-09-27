import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_3 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources", Locale.US);
        Locale locale = bundle.getLocale();
        System.out.println("Locale: " + locale);
    }
}
