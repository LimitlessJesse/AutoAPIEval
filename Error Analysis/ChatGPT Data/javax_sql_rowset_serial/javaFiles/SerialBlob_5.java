import javax.sql.rowset.serial.SerialBlob;
import java.sql.SQLException;

public class SerialBlob_5 {
    public static void main(String[] args) {
        try {
            byte[] bytes = {65, 66, 67, 68};
            SerialBlob serialBlob = new SerialBlob(bytes);
            System.out.println("Original bytes: " + serialBlob.getBytes(1, 4));

            byte[] newBytes = {69, 70, 71, 72};
            serialBlob.setBytes(1, newBytes);
            System.out.println("Modified bytes: " + serialBlob.getBytes(1, 4));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
