import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriter_4 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            writer.write("Hello, World!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
