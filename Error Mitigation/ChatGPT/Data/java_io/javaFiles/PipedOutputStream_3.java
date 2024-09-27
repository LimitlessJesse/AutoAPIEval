import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_3 {
    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            byte[] data = {65, 66, 67}; // ASCII values for A, B, C
            output.write(data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
