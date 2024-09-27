import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriter_1 {
    public static void main(String[] args) {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try {
            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
