import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_5 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello");
            writer.newLine(); // This is where the new line is added
            writer.write("World");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
