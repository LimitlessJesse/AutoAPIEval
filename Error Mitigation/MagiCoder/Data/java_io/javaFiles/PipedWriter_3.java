import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_3 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
