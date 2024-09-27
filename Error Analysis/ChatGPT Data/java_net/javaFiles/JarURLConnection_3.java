import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Map;

public class JarURLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your/jar/file.jar!/");
            JarURLConnection connection = (JarURLConnection) url.openConnection();
            Map<String, List<String>> attributes = connection.getMainAttributes();
            for (Map.Entry<String, List<String>> entry : attributes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
