import java.io.IOException;
import java.io.InputStream;

public class InputStream_5 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            int available = inputStream.available();
            System.out.println("Number of bytes that can be read: " + available);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
