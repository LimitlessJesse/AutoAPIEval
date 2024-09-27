import java.net.JarURLConnection;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.io.IOException;
import java.net.URL;

public class JarURLConnection_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your/jar/file.jar!/folder/file.txt");
            JarURLConnection connection = (JarURLConnection) url.openConnection();
            JarFile jarFile = connection.getJarFile();
            JarEntry entry = connection.getJarEntry();
            
            System.out.println("Jar file name: " + jarFile.getName());
            System.out.println("Jar entry name: " + entry.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
