import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_3 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getManifest_3Attributes();
        System.out.println(attributes);
    }
}
