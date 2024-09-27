import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStream_5 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] bytes = data.getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);

        try {
            int available = inputStream.available();
            System.out.println("Number of bytes available: " + available);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
