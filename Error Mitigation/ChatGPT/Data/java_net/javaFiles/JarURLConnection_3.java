import java.io.IOException;
import java.net.JarURLConnection;
import java.util.jar.Attributes;

public class JarURLConnection_3 {
    public static void main(String[] args) {
        try {
            JarURLConnection jarConnection = null; // Initialize with your JarURLConnection object
            Attributes attributes = jarConnection.getAttributes();
            System.out.println(attributes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
