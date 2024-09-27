import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReader_1 {
    public static void main(String[] args) {
        try {
            PipedReader reader = new PipedReader();
            PipedWriter writer = new PipedWriter();
            
            reader.connect(writer);
            
            // Use the connected reader and writer for further operations
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
