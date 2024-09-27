import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter_4 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
            writer.println("Hello, World!");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
