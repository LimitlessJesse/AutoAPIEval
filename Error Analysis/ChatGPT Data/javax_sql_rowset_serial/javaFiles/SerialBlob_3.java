import javax.sql.rowset.serial.SerialBlob;
import java.io.InputStream;
import java.sql.Blob;

public class SerialBlob_3 {
    public static void main(String[] args) {
        try {
            byte[] data = {65, 66, 67, 68, 69};
            Blob blob = new SerialBlob(data);
            InputStream inputStream = blob.getBinaryStream();

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }

            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
