import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_4 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            writer.write('A');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
