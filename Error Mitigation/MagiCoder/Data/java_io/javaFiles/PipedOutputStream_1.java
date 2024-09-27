import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedOutputStream_1 {
    public static void main(String[] args) {
        try {
            PipedInputStream pis = new PipedInputStream();
            PipedOutputStream pos = new PipedOutputStream();

            pos.connect(pis);

            // Now you can write to pos and read from pis

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
