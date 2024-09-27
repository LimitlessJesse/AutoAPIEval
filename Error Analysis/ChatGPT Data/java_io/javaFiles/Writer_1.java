import java.io.FileWriter;
import java.io.IOException;

public class Writer_1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is a sample text.");
            writer.close();
            System.out.println("write() method executed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
