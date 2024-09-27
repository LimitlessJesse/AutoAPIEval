import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            // write some data
            fos.write("Hello, World!".getBytes());
            // close the file output stream
            fos.close();
            System.out.println("File closed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
