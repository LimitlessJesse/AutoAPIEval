import java.io.IOException;
import java.security.DigestInputStream;

public class DigestInputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a DigestInputStream object
            DigestInputStream dis = new DigestInputStream(null, null);
            
            // Read the next byte of data from the input stream
            int data = dis.read();
            
            // Use the data read from the input stream
            System.out.println("Data read: " + data);
        } catch (IOException e) {
            System.out.println("An error occurred while reading data: " + e.getMessage());
        }
    }
}
