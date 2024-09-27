import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_5 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello");
            writer.newLine();
            writer.write("World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
