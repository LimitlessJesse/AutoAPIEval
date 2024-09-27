import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_5 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getAttributes("Manifest_5-Class");
        System.out.println(attributes);
    }
}
