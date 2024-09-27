import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Control_5 {
    public static void main(String[] args) {
        String baseName = "MyResources";
        Locale locale = Locale.US;
        ResourceBundle.Control control = new ResourceBundle.Control() {
            @Override
            public long getTimeToLive(String baseName, Locale locale) {
                // Implement your logic for getTimeToLive here
                return 3600000L; // Example: 1 hour
            }
        };
        
        long timeToLive = control.getTimeToLive(baseName, locale);
        System.out.println("Time to live for " + baseName + " in " + locale + " is " + timeToLive + " milliseconds.");
    }
}
