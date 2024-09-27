import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_7 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            String str = "Hello, World!";
            writer.write(str, 0, str.length());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
