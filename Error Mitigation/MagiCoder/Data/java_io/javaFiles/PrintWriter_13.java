import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_13 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
            writer.println("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
