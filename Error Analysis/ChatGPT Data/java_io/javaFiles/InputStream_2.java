import java.io.InputStream;
import java.io.IOException;

public class InputStream_2 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        try {
            InputStream inputStream = System.in;
            int bytesRead = inputStream.read(buffer);
            System.out.println("Number of bytes read: " + bytesRead);
            System.out.println("Data read from input stream: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
