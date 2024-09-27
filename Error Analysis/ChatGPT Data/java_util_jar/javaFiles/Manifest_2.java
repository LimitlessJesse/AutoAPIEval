import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_2 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getMainAttributes();
        String value = attributes.getValue("Manifest-Version");
        System.out.println("Manifest-Version: " + value);
    }
}
