import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;
import java.io.OutputStream;

public class SerialBlob_3 {
    public static void main(String[] args) {
        try {
            // Create a connection
            Connection conn = DriverManager.getConnection("jdbc:derby:memory:db;create=true");

            // Create a SerialBlob
            Blob blob = new SerialBlob(new byte[] { 1, 2, 3, 4, 5 });

            // Get the OutputStream of the Blob
            OutputStream outputStream = blob.setBinaryStream(1);

            // Write to the OutputStream
            outputStream.write(6);
            outputStream.write(7);

            // Close the OutputStream
            outputStream.close();

            // Print the Blob
            System.out.println(new String(((SerialBlob) blob).getBytes(1, 4)));

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
