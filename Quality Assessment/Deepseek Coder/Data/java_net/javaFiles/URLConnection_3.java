import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlConnection = url.openConnection();
            String contentType = urlConnection.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
