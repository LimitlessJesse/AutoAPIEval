import java.io.IOException;
import java.io.PipedInputStream;

public class PipedInputStream_3 {
    public static void main(String[] args) {
        try {
            PipedInputStream input = new PipedInputStream();
            byte[] buffer = new byte[10];
            int bytesRead = input.read(buffer, 0, 5);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
