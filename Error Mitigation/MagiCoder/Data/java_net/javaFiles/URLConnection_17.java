import java.net.URL;
import java.net.URLConnection;

public class URLConnection_17 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDefaultUseCaches(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
