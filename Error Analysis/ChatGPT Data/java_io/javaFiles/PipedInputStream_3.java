import java.io.PipedInputStream;
import java.io.IOException;

public class PipedInputStream_3 {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[10];
            int bytesRead;
            PipedInputStream in = new PipedInputStream();
            
            // Reading from PipedInputStream
            bytesRead = in.read(buffer, 0, buffer.length);
            
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
