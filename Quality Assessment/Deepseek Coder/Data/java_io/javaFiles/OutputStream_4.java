import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_4 {
    public static void main(String[] args) {
        try {
            // Create a new FileOutputStream
            OutputStream outputStream = new FileOutputStream("output.txt");

            // Write some data to the output stream
            outputStream.write(65);  // 'A'
            outputStream.write(66);  // 'B'

            // Flush the output stream
            outputStream.flush();

            // Close the output stream
            outputStream.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
