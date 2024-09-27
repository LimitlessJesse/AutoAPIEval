import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriter_1 {
    public static void main(String[] args) {
        try {
            PipedWriter pipedWriter = new PipedWriter();
            PipedReader pipedReader = new PipedReader();

            pipedWriter.connect(pipedReader);

            // Now you can write to pipedWriter and read from pipedReader

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
