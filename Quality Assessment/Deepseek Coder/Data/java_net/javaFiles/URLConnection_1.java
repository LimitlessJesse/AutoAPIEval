import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlConnection = url.openConnection();
            int contentLength = urlConnection.getContentLength();
            if (contentLength > 0) {
                System.out.println("Content length: " + contentLength);
            } else {
                System.out.println("Content length not available");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
