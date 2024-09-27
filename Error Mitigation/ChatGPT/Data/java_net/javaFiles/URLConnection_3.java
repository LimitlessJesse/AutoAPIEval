import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
