import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.SQLException;

public class SQLInputImpl_2 {
    public static void main(String[] args) {
        SQLInputImpl input = new SQLInputImpl(null, null);
        String data = null;
        try {
            data = input.readString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(data);
    }
}
