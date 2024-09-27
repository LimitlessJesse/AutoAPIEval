import java.io.IOException;
import java.io.PipedInputStream;

public class PipedInputStream_1 {
    public static void main(String[] args) {
        try {
            PipedInputStream pipedInputStream = new PipedInputStream();
            pipedInputStream.read(); // Reads a byte of data from this input stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
