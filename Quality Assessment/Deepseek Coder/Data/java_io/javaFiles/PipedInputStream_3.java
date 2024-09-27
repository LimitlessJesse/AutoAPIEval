import java.io.PipedInputStream;
import java.io.IOException;

public class PipedInputStream_3 {
    public static void main(String[] args) {
        try {
            PipedInputStream pipedInputStream = new PipedInputStream();
            byte[] buffer = new byte[10];
            int read = pipedInputStream.read(buffer, 0, buffer.length);
            System.out.println("Number of bytes read: " + read);
            System.out.println("Data read: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
