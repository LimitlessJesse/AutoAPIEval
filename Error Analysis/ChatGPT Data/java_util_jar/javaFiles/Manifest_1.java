import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_1 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes mainAttributes = manifest.getMainAttributes();
        
        System.out.println("Main Attributes:");
        for(Object key : mainAttributes.keySet()){
            System.out.println(key + ": " + mainAttributes.getValue(key));
        }
    }
}
