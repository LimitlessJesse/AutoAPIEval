import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.SQLException;

public class SQLInputImpl_3 {
    public static void main(String[] args) {
        SQLInputImpl input = new SQLInputImpl();
        try {
            boolean value = input.readBoolean();
            System.out.println(value);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
