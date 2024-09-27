import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_2 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        
        // Add an entry with a null key and an arbitrary value
        manifest.getEntries().put(null, new Attributes());
        
        // Get the Attributes for the specified entry name (null in this case)
        Attributes attributes = manifest.getAttributes(null);
        
        // Print the Attributes
        System.out.println(attributes);
    }
}
