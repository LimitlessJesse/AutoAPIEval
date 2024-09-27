import java.io.PipedOutputStream;
import java.io.IOException;

public class PipedOutputStream_5 {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            byte[] bytes = "Hello, World!".getBytes();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
