import java.io.PipedWriter;
import java.io.IOException;

public class PipedWriter_3 {
    public static void main(String[] args) {
        PipedWriter writer = new PipedWriter();
        try {
            writer.write('A');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
