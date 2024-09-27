import java.io.PipedInputStream;
import java.io.IOException;

public class PipedInputStream_1 {
    public static void main(String[] args) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        Thread thread = new Thread(() -> {
            try {
                pipedInputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }
}
