import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_2 {
    public static void main(String[] args) {
        try {
            // Create a new BufferedOutputStream
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));

            // Write a byte to the output stream
            bos.write('A');

            // Flush the output stream
            bos.flush();

            // Close the output stream
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
