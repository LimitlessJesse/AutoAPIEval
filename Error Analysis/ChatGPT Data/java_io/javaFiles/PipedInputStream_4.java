import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_4 {
    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            PipedInputStream input = new PipedInputStream();

            // Connect the PipedOutputStream to the PipedInputStream
            input.connect(output);

            // Use the input and output streams here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
