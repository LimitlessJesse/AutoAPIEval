import java.io.IOException;
import java.io.PipedInputStream;

public class PipedInputStream_4 {
    public static void main(String[] args) {
        try {
            PipedInputStream input = new PipedInputStream();
            int bytesAvailable = input.available();
            System.out.println("Bytes available to read: " + bytesAvailable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
