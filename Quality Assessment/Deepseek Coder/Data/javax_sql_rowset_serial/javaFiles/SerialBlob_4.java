import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

public class SerialBlob_4 {
    public static void main(String[] args) {
        try {
            // Create a SerialBlob object
            Blob blob = new SerialBlob("Hello, World!");

            // Truncate the blob to 5 characters
            blob.truncate(5);

            // Print the truncated blob
            System.out.println(new String(blob.getBytes(1, (int) blob.length())));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
