import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
            System.out.println("Output stream closed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
