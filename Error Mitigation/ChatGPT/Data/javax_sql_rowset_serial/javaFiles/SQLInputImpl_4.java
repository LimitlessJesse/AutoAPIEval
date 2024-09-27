import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.Blob;
import java.sql.SQLException;

public class SQLInputImpl_4 {
    public static void main(String[] args) {
        SQLInputImpl sqlInput = new SQLInputImpl();
        try {
            Blob blob = sqlInput.readBlob();
            if (blob != null) {
                System.out.println("Blob value: " + blob.toString());
            } else {
                System.out.println("Blob value is SQL NULL");
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
