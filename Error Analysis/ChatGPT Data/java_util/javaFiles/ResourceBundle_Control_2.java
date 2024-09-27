import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Control_2 {
    public static void main(String[] args) {
        String baseName = "example.properties";
        Locale locale = new Locale("en", "US");
        
        ResourceBundle.Control control = new ResourceBundle.Control() {
            @Override
            public Locale getFallbackLocale(String baseName, Locale locale) {
                // Custom logic to determine fallback locale
                return new Locale("en");
            }
        };
        
        Locale fallbackLocale = control.getFallbackLocale(baseName, locale);
        System.out.println("Fallback Locale: " + fallbackLocale);
    }
}
