import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Attributes_1 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getAttributes_1Attributes();
        
        attributes.put(new Attributes.Name("Test-Attribute"), "Test Value");
        
        boolean containsKey = attributes.containsKey(new Attributes.Name("Test-Attribute"));
        
        System.out.println("Does the key exist? " + containsKey);
    }
}
