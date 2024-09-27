import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writer_5 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
