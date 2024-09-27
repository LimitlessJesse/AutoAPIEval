import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.SQLException;

public class SQLInputImpl_3 {
    public static void main(String[] args) {
        SQLInputImpl sqlInput = new SQLInputImpl(null, null);
        long result = 0;
        try {
            result = sqlInput.readLong();
            System.out.println("Long value: " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
