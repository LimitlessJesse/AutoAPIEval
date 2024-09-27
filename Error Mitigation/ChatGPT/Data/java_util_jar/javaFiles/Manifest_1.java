import java.util.jar.Manifest;
import java.util.jar.Attributes;

public class Manifest_1 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes mainAttributes = manifest.getManifest_1Attributes();
        System.out.println(mainAttributes);
    }
}
