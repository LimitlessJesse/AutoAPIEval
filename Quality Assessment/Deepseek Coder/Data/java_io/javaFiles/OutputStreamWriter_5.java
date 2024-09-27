import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriter_5 {
    public static void main(String[] args) {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try {
            writer.write("Hello, World!!!", 0, 5);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
