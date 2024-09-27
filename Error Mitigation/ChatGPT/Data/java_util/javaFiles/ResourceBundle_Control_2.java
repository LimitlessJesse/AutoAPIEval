import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Control_2 {
    public static void main(String[] args) {
        ResourceBundle.Control control = new ResourceBundle.Control() {
            @Override
            public Locale getFallbackLocale(String baseName, Locale locale) {
                // Custom implementation for getFallbackLocale method
                return super.getFallbackLocale(baseName, locale);
            }
        };
        
        // Example usage of getFallbackLocale method
        Locale fallbackLocale = control.getFallbackLocale("exampleBaseName", Locale.US);
        System.out.println("Fallback Locale: " + fallbackLocale);
    }
}
