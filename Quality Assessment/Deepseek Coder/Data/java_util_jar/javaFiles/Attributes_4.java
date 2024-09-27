import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Attributes_4 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getAttributes_4Attributes();
        attributes.put(new Attributes.Name("Created-By"), "Your Name");
        attributes.put(new Attributes.Name("Build-Jdk"), "1.8.0_121");
        System.out.println(attributes);
    }
}
