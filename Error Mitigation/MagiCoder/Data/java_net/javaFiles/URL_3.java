import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URL_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection urlConnection = url.openConnection();
            System.out.println(urlConnection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
