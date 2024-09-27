import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import java.io.IOException;

public class ResourceBundle_Control_7 {
    public static void main(String[] args) {
        try {
            // Create a ResourceBundle.Control instance
            Control control = ResourceBundle.getBundle("baseName").getBundleClassLoader().getResourceBundle("baseName").getControl();

            // Create a ResourceBundle using the newBundle method
            ResourceBundle bundle = control.newBundle("baseName", Locale.getDefault(), "format", loader, reload);

            // Print the ResourceBundle
            System.out.println(bundle);

        } catch (IOException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
