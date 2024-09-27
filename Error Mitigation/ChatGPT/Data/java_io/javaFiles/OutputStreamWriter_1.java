import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriter_1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            writer.write(65); // writing character 'A'
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
