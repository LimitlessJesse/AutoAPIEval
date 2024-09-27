import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            // Read from the input stream (here we just print it to the console)
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print((char) data);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
