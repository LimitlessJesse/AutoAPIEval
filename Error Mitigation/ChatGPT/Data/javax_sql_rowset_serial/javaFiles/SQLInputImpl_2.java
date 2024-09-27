import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.Array;
import java.sql.SQLException;

public class SQLInputImpl_2 {
    public static void main(String[] args) {
        SQLInputImpl sqlInput = new SQLInputImpl(null, null, null);
        try {
            Array array = sqlInput.readArray();
            if (array != null) {
                System.out.println("Array value: " + array.toString());
            } else {
                System.out.println("Array value is SQL NULL");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
