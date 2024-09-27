import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_10 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection connection = url.openConnection();
            String contentType = connection.getHeaderField("Content-Type");
            System.out.println("Content-Type: " + contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
