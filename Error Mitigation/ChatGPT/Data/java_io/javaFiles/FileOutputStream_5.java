import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write("Hello, World!".getBytes());
            fos.close();
            System.out.println("File output stream closed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
