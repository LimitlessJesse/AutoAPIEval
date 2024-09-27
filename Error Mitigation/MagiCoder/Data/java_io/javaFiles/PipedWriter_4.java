import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_4 {
    public static void main(String[] args) {
        PipedWriter writer = new PipedWriter();
        try {
            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
