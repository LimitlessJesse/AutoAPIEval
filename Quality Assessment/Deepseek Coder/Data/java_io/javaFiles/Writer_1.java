import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writer_1 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("example.txt");
            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
