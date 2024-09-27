import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

public class SerialBlob_5 {
    public static void main(String[] args) {
        try {
            String data = "Hello, World!";
            Blob blob = new SerialBlob(data.getBytes());
            
            // Use the blob
            System.out.println("Blob data: " + new String((byte[]) blob.getBytes(1, (int) blob.length())));
            
            // Free the blob
            blob.free();
            
            // Try to access the blob after freeing it
            // This will throw a SQLException
            System.out.println("Blob data after free: " + new String((byte[]) blob.getBytes(1, (int) blob.length())));
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
