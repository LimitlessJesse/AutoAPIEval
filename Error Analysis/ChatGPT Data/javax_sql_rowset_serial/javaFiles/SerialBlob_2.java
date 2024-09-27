import javax.sql.rowset.serial.SerialBlob;
import java.sql.SQLException;

public class SerialBlob_2 {
    public static void main(String[] args) {
        try {
            byte[] bytes = {1, 2, 3, 4, 5};
            SerialBlob serialBlob = new SerialBlob(bytes);
            System.out.println("Length of the serialBlob: " + serialBlob.length());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
