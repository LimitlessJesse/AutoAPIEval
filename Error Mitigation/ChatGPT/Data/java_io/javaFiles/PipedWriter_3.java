import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_3 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            char[] data = {'H', 'e', 'l', 'l', 'o'};
            writer.write(data, 0, 5);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
