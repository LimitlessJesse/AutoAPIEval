import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

public class SerialBlob_3 {
    public static void main(String[] args) {
        try {
            byte[] bytes = {65, 66, 67, 68, 69}; // Sample byte array
            SerialBlob serialBlob = new SerialBlob(bytes);
            long blobLength = serialBlob.length();
            System.out.println("Length of SerialBlob: " + blobLength);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
