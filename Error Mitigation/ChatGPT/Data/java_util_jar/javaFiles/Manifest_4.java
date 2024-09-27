import java.io.IOException;
import java.io.OutputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Manifest_4 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getManifest_4Attributes();
        attributes.putValue(Attributes.Name.MANIFEST_VERSION.toString(), "1.0");
        
        try {
            OutputStream outputStream = System.out; // Using System.out as an example, you can use any other OutputStream
            manifest.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
