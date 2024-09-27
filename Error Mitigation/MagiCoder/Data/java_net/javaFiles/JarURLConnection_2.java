import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;

public class JarURLConnection_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your.jar!/");
            URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof JarURLConnection) {
                JarURLConnection jarURLConnection = (JarURLConnection) urlConnection;
                URL jarFileURL = jarURLConnection.getJarFileURL();
                System.out.println(jarFileURL);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
