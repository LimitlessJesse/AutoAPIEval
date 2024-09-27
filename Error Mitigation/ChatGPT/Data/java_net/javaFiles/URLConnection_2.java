import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            // Read from the input stream here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
