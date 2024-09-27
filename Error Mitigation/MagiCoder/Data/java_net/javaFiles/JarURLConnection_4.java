import java.net.JarURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;

public class JarURLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your.jar!/");
            JarURLConnection jarConn = (JarURLConnection) url.openConnection();
            System.out.println(jarConn.getJarEntry());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
