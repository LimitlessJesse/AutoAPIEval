import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_8 {
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
