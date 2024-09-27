import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_9 {
    public static void main(String[] args) {
        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(System.out);
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer!= null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
