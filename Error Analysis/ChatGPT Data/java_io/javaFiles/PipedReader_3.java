import java.io.IOException;
import java.io.PipedReader;

public class PipedReader_3 {
    public static void main(String[] args) {
        char[] cbuf = new char[5];
        PipedReader reader = new PipedReader();

        try {
            int bytesRead = reader.read(cbuf, 0, 5);
            System.out.println("Number of bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
