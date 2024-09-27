import java.io.IOException;
import java.io.PipedInputStream;

public class PipedInputStream_5 {
    public static void main(String[] args) {
        try {
            PipedInputStream input = new PipedInputStream();
            int bytesAvailable = input.available();
            System.out.println("Bytes Available: " + bytesAvailable);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
