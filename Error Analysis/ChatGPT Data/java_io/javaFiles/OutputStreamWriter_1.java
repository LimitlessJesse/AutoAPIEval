import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriter_1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("output.txt"));
            writer.write('A');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
