import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_8 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        manifest.getManifest_8Attributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getManifest_8Attributes().put(Attributes.Name.CREATED_BY, "Your Name");

        System.out.println("Before clear: " + manifest.getManifest_8Attributes());

        manifest.getManifest_8Attributes().clear();

        System.out.println("After clear: " + manifest.getManifest_8Attributes());
    }
}
