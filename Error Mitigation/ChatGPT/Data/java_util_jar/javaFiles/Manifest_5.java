import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

public class Manifest_5 {
    public static void main(String[] args) {
        try {
            Manifest manifest = new Manifest();
            InputStream inputStream = Manifest_5.class.getResourceAsStream("manifest.mf");
            manifest.read(inputStream);
            System.out.println("Manifest read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the Manifest: " + e.getMessage());
        }
    }
}
