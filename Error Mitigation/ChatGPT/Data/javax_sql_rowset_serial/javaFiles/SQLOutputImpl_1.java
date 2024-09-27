import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.Array;
import java.sql.SQLException;

public class SQLOutputImpl_1 {
    public static void main(String[] args) {
        SQLOutputImpl sqlOutput = new SQLOutputImpl();
        Array array = null; // Initialize with your Array object
        
        try {
            sqlOutput.writeArray(array);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
