import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URL_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            InputStream inputStream = url.openStream();

            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
