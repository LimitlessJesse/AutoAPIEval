import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_1 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", locale);
        String message = bundle.getString("greeting");
        System.out.println(message);
    }
}
