import java.io.IOException;
import java.net.JarURLConnection;
import java.util.jar.JarFile;

public class JarURLConnection_1 {
    public static void main(String[] args) {
        try {
            JarURLConnection jarConnection = new JarURLConnection(null, null);
            JarFile jarFile = jarConnection.getJarFile();
            System.out.println("Jar file: " + jarFile.getName());
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}
