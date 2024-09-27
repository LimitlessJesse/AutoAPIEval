import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;

public class SerialBlob_2 {
    public static void main(String[] args) {
        try {
            // Create a SerialBlob object
            byte[] bytes = {1, 2, 3, 4, 5};
            SerialBlob serialBlob = new SerialBlob(bytes);

            // Get bytes from the SerialBlob object
            byte[] copiedBytes = serialBlob.getBytes(1, 3);

            // Print the copied bytes
            for (byte b : copiedBytes) {
                System.out.print(b + " ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
