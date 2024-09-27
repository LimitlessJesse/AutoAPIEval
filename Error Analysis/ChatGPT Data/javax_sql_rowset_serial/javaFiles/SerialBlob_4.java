import javax.sql.rowset.serial.SerialBlob;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;

public class SerialBlob_4 {
    public static void main(String[] args) {
        try {
            byte[] data = {65, 66, 67, 68, 69}; // Sample data
            
            // Create a SerialBlob object
            Blob blob = new SerialBlob(data);
            
            // Get an output stream at the specified position
            OutputStream outputStream = blob.setBinaryStream(2); // position 2
            
            // Write data to the output stream
            outputStream.write(data);
            
            // Display the final blob data
            System.out.println("Final Blob Data: " + new String(blob.getBytes(1, (int) blob.length())));
            
            // Close the output stream
            outputStream.close();
        } catch (SQLException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
