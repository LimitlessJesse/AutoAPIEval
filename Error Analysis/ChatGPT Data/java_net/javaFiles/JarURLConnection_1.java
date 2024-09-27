import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.JarFile;

public class JarURLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your/jar/file.jar!/");
            JarURLConnection connection = (JarURLConnection) url.openConnection();
            JarFile jarFile = connection.getJarFile();
            System.out.println(jarFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
