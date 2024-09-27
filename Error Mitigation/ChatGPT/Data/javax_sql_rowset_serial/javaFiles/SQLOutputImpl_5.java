import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLException;

public class SQLOutputImpl_5 {
    public static void main(String[] args) {
        SQLOutputImpl sqlOutput = new SQLOutputImpl();
        try {
            sqlOutput.writeBoolean(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
