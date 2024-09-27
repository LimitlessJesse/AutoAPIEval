import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriter_1 {
    public static void main(String[] args) {
        PipedWriter src = new PipedWriter();
        PipedReader snk = new PipedReader();
        
        try {
            src.connect(snk);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
