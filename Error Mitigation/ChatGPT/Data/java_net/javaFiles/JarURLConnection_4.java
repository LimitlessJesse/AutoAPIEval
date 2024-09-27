import java.io.IOException;
import java.net.JarURLConnection;
import java.util.jar.Manifest;
import java.net.URL;

public class JarURLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your/jar/file.jar!/");
            JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
            Manifest manifest = jarConnection.getManifest();
            System.out.println(manifest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
