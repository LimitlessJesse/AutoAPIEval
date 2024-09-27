import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.Clob;
import java.sql.SQLException;

public class SQLInputImpl_5 {
    public static void main(String[] args) {
        SQLInputImpl sqlInput = new SQLInputImpl();
        
        try {
            Clob clob = sqlInput.readClob();
            if (clob != null) {
                System.out.println("CLOB value: " + clob.getSubString(1, (int) clob.length()));
            } else {
                System.out.println("CLOB value is NULL");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
