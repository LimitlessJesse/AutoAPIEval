import java.io.IOException;
import java.net.JarURLConnection;
import java.util.jar.JarEntry;

public class JarURLConnection_2 {
    public static void main(String[] args) {
        try {
            JarURLConnection jarConnection = new JarURLConnection(null, null);
            JarEntry jarEntry = jarConnection.getJarEntry();
            System.out.println("Jar Entry: " + jarEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
