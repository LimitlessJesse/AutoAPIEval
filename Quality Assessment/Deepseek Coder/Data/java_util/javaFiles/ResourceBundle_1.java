import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_1 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", locale);
        System.out.println(bundle.getString("greeting"));
    }
}
