import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            // Use inputStream here
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
