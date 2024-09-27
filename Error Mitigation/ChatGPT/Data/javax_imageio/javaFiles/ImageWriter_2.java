import javax.imageio.ImageWriter;
import java.util.Locale;

public class ImageWriter_2 {
    public static void main(String[] args) {
        ImageWriter imageWriter = null; // Initialize ImageWriter object
        
        Locale locale = new Locale("en_US"); // Create a new Locale object
        
        // Set the Locale for the ImageWriter
        imageWriter.setLocale(locale);
    }
}
