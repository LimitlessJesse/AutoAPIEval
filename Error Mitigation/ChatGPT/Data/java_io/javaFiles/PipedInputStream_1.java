import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_1 {
    public static void main(String[] args) {
        try {
            PipedInputStream input = new PipedInputStream();
            PipedOutputStream output = new PipedOutputStream();

            // Connect the input stream to the output stream
            input.connect(output);

            System.out.println("PipedInputStream connected to PipedOutputStream successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
