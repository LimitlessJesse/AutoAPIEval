import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Attributes_5 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getAttributes_5Attributes();
        
        attributes.put(new Attributes.Name("Created-By"), "John Doe");
        attributes.put(new Attributes.Name("Build-Jdk"), "1.8");
        
        System.out.println("Before removing: " + attributes);
        
        attributes.remove(new Attributes.Name("Created-By"));
        
        System.out.println("After removing: " + attributes);
    }
}
