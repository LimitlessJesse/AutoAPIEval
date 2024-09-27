import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_5 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            byte[] data = "Hello, World!".getBytes();
            pos.write(data, 0, data.length);
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
