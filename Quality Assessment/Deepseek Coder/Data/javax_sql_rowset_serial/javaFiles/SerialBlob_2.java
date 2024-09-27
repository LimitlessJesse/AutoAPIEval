import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;
import java.io.InputStream;

public class SerialBlob_2 {
    public static void main(String[] args) {
        try {
            // Create a connection
            Connection conn = DriverManager.getConnection("jdbc:derby:memory:test;create=true");

            // Create a blob
            Blob blob = new SerialBlob(new byte[]{1, 2, 3, 4, 5});

            // Get the binary stream
            InputStream inputStream = blob.getBinaryStream();

            // Read the binary stream
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print(data + " ");
            }

            // Close the connection
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
