import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_1 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // Example byte array
        
        try {
            FileImageOutputStream output = new FileImageOutputStream(new File("output.txt"));
            output.write(data, 1, 3); // Write bytes from index 1 to 3
            output.close();
            
            System.out.println("Bytes written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing bytes: " + e.getMessage());
        }
    }
}
