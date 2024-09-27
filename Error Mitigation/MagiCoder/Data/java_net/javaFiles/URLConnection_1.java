import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection urlConnection = url.openConnection();
            URL urlFromConnection = urlConnection.getURL();
            System.out.println(urlFromConnection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
