import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);

            OutputStream outputStream = urlConnection.getOutputStream();
            String data = "Hello, World!";
            outputStream.write(data.getBytes());
            outputStream.flush();
            outputStream.close();

            System.out.println("Data sent successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
