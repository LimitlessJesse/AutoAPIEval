import javax.imageio.stream.FileCacheImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageOutputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a File object to write to
            File file = new File("output.jpg");
            
            // Create a FileCacheImageOutputStream for the file
            ImageOutputStream imageOutputStream = new FileCacheImageOutputStream(file);
            
            // Define a byte array to be written
            byte[] data = {72, 101, 108, 108, 111}; // "Hello" in ASCII
            
            // Write the byte array data starting at offset 0 with length 5 to the output stream
            ((FileCacheImageOutputStream) imageOutputStream).write(data, 0, 5);
            
            // Close the stream
            imageOutputStream.close();
            
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }
    }
}
