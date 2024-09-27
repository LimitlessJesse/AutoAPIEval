import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import java.sql.Blob;
import java.sql.SQLException;

public class SerialBlob_5 {
    public static void main(String[] args) {
        try {
            byte[] data = {1, 2, 3, 4, 5};
            Blob blob = new SerialBlob(data);
            System.out.println("Original Blob length: " + blob.length());
            
            if (blob instanceof SerialBlob) {
                SerialBlob serialBlob = (SerialBlob) blob;
                serialBlob.truncate(3);
                System.out.println("Truncated Blob length: " + serialBlob.length());
            }
        } catch (SerialException | SQLException e) {
            e.printStackTrace();
        }
    }
}
