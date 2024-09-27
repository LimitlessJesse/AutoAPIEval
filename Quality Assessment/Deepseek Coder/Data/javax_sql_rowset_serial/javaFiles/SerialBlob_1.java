import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

public class SerialBlob_1 {
    public static void main(String[] args) {
        try {
            String data = "Hello, World!";
            Blob blob = new SerialBlob(data.getBytes());
            long length = blob.length();
            System.out.println("Length of the Blob: " + length);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
