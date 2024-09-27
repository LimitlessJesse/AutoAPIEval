import javax.sql.rowset.serial.SerialBlob;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialException;

public class SerialBlob_2 {
    public static void main(String[] args) {
        try {
            byte[] byteArray = {65, 66, 67, 68, 69}; // Sample byte array
            SerialBlob serialBlob = new SerialBlob(byteArray);
            InputStream inputStream = serialBlob.getBinaryStream();
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
        } catch (SQLException | SerialException e) {
            e.printStackTrace();
        }
    }
}
