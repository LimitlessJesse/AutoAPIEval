import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_4 {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            // Some operations
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
