import javax.sql.rowset.serial.SerialBlob;
import java.io.InputStream;
import java.sql.SQLException;

public class SerialBlob_4 {
    public static void main(String[] args) {
        try {
            // Create a SerialBlob object
            SerialBlob serialBlob = new SerialBlob(new byte[]{1, 2, 3, 4, 5});

            // Get the binary stream
            InputStream inputStream = serialBlob.getBinaryStream();

            // Read from the stream
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print(data + " ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
