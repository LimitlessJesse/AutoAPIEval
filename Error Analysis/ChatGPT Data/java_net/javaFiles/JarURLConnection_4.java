import java.net.JarURLConnection;
import java.net.URL;

public class JarURLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your/jar/file.jar!/");
            JarURLConnection connection = (JarURLConnection) url.openConnection();
            System.out.println(connection.getManifest());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
