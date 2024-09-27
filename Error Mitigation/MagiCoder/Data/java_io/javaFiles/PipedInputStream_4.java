import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_4 {
    public static void main(String[] args) {
        try {
            PipedInputStream pis = new PipedInputStream();
            PipedOutputStream pos = new PipedOutputStream();
            pis.connect(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
