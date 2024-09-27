import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_6 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            writer.println("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
