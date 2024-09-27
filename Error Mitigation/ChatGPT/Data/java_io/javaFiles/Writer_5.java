import java.io.FileWriter;
import java.io.IOException;

public class Writer_5 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            writer.flush(); // Flush the stream
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
