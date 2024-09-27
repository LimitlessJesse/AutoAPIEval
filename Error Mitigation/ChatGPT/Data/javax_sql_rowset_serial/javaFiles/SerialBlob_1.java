import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Arrays;

public class SerialBlob_1 {
    public static void main(String[] args) {
        try {
            byte[] data = {1, 2, 3, 4, 5};
            SerialBlob serialBlob = new SerialBlob(data);
            
            long pos = 2;
            int length = 3;
            byte[] copiedBytes = serialBlob.getBytes(pos, length);
            
            System.out.println("Original data: " + Arrays.toString(data));
            System.out.println("Copied bytes: " + Arrays.toString(copiedBytes));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
