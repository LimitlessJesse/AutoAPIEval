import java.net.JarURLConnection;
import java.net.URL;
import java.util.Map;

public class JarURLConnection_5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your.jar!/");
            JarURLConnection connection = (JarURLConnection) url.openConnection();
            Map<String, List<String>> attributes = connection.getAttributes();
            System.out.println(attributes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
