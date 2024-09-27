import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedOutputStream_1 {
    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            PipedInputStream input = new PipedInputStream();
            
            output.connect(input);
            
            // Use the connected streams for communication
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
