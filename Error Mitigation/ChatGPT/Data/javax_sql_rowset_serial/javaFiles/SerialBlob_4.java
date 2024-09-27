import javax.sql.rowset.serial.SerialBlob;
import java.io.OutputStream;
import java.sql.SQLException;
import java.sql.SerialException;

public class SerialBlob_4 {
    public static void main(String[] args) {
        try {
            SerialBlob serialBlob = new SerialBlob(new byte[]{1, 2, 3, 4, 5});
            OutputStream outputStream = serialBlob.setBinaryStream(0);
            // Write data to the output stream
            outputStream.write(new byte[]{6, 7, 8});
            System.out.println("Data written to the Blob successfully.");
        } catch (SQLException | SerialException e) {
            e.printStackTrace();
        }
    }
}
