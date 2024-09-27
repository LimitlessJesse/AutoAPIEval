import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_8 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            long contentLength = urlConnection.getContentLengthLong();
            System.out.println("Content length: " + contentLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
