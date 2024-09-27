import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Attributes_2 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getAttributes_2Attributes();
        String value = attributes.getValue("Manifest-Version");
        System.out.println(value);
    }
}
