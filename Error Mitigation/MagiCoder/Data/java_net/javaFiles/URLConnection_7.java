import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_7 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection connection = url.openConnection();
            int contentLength = connection.getContentLength();
            System.out.println("Content length: " + contentLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
