import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_5 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
            int off = 0;
            int len = 5;
            writer.write(cbuf, off, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
