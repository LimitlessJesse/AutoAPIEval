import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_3 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            char[] content = {'H', 'e', 'l', 'l', 'o'};
            writer.write(content, 0, content.length);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
